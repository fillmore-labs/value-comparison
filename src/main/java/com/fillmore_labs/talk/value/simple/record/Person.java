package com.fillmore_labs.talk.value.simple.record;

import com.google.auto.value.AutoBuilder;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.checkerframework.checker.nullness.qual.Nullable;

/** Representation of a person. */
@SuppressWarnings({"UnusedVariable", "FieldCanBeStatic", "optional:optional.field"})
public record Person(String givenName, Optional<String> surname, ImmutableSet<EmailAddress> email) {
  /**
   * Creates a Person.
   *
   * @param givenName Set the given name. Required.
   * @param surname Set the surname. Optional, i.e for royalty.
   * @param email Email addresses this person is reachable under.
   */
  public Person {
    Objects.requireNonNull(givenName, "givenName is a required parameter");
    Objects.requireNonNull(surname);
    Objects.requireNonNull(email);
  }

  /**
   * Creates a Person builder.
   *
   * @return A new fluent builder
   */
  public static Builder builder() {
    return new AutoBuilder_Person_Builder().email(ImmutableSet.of());
  }

  @AutoBuilder(ofClass = Person.class)
  public abstract static class Builder {
    /**
     * Sets the given name (required).
     *
     * @param name give name
     * @return fluent builder
     */
    public abstract Builder givenName(String name);

    /**
     * Sets the surname (optional).
     *
     * @param name surname
     * @return fluent builder
     */
    public abstract Builder surname(@Nullable String name);

    /**
     * Sets the email (optional).
     *
     * @param email List of emails
     * @return fluent builder
     */
    public abstract Builder email(Iterable<EmailAddress> email);

    /**
     * Convenience method - sets email usings strings.
     *
     * @param email list of strings
     * @return fluent builder
     */
    @CanIgnoreReturnValue
    public final Builder email(String... email) {
      return email(
          Arrays.stream(email).map(EmailAddress::of).collect(ImmutableSet.toImmutableSet()));
    }

    /**
     * Builds a person with the supplied parameters.
     *
     * @return person
     */
    public abstract Person build();
  }
}
