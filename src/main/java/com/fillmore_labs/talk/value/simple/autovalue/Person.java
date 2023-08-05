package com.fillmore_labs.talk.value.simple.autovalue;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Optional;
import org.checkerframework.checker.nullness.qual.Nullable;

/** Representation of a person. */
@Immutable
@AutoValue
public abstract class Person {
  /* package */ Person() {}

  /**
   * Creates a Person builder.
   *
   * @return A new builder
   */
  public static Builder builder() {
    return new AutoValue_Person.Builder();
  }

  /**
   * The given name of this person. Everyone has one.
   *
   * @return A name.
   */
  public abstract String givenName();

  /**
   * The surname name of this person. Optional, i.e for royalty.
   *
   * @return An optional name
   */
  public abstract Optional<String> surname();

  /**
   * Email addresses this person is reachable under.
   *
   * @return An immutable set of email addresses
   */
  public abstract ImmutableSet<EmailAddress> email();

  /** Builder of a person instance. */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * Set the given name. Required.
     *
     * @param givenName A name
     * @return This builder
     */
    public abstract Builder givenName(String givenName);

    /**
     * Set the surname. Optional, i.e for royalty.
     *
     * @param surname A name
     * @return This builder
     */
    public abstract Builder surname(@Nullable String surname);

    /**
     * Email addresses this person is reachable under. Optional.
     *
     * @param email A list of emails
     * @return This builder
     */
    public abstract Builder email(Iterable<EmailAddress> email);

    /**
     * Email addresses this person is reachable under. Optional.
     *
     * @param email Emails
     * @return This builder
     */
    public abstract Builder email(EmailAddress... email);

    /**
     * Email addresses this person is reachable under. Optional. Convenience function mapping {@link
     * String} to {@link EmailAddress}
     *
     * @param email Emails
     * @return This builder
     */
    @CanIgnoreReturnValue
    public final Builder email(String... email) {
      return email(
          Arrays.stream(email).map(EmailAddress::of).collect(ImmutableSet.toImmutableSet()));
    }

    /**
     * Email addresses this person is reachable under. Optional.
     *
     * @return An {@link ImmutableSet} builder
     */
    public abstract ImmutableSet.Builder<EmailAddress> emailBuilder();

    /**
     * Constructs a new person with the given parameters.
     *
     * @return A person
     */
    public abstract Person build();
  }
}
