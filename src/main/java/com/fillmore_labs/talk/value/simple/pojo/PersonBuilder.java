package com.fillmore_labs.talk.value.simple.pojo;

import com.google.auto.value.AutoBuilder;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.Nullable;

@AutoBuilder(ofClass = Person.class)
public abstract class PersonBuilder {
  /* package */ static PersonBuilder builder() {
    return new AutoBuilder_PersonBuilder().email(ImmutableSet.of());
  }

  /**
   * Set the given name. Required.
   *
   * @param name give name
   * @return fluent builder
   */
  public abstract PersonBuilder givenName(String name);

  /**
   * Set the surname. Optional, i.e for royalty.
   *
   * @param name surname
   * @return fluent builder
   */
  public abstract PersonBuilder surname(@Nullable String name);

  /**
   * Email addresses this person is reachable under. Optional.
   *
   * @param email List of emails
   * @return fluent builder
   */
  public abstract PersonBuilder email(Iterable<EmailAddress> email);

  /**
   * Convenience method - sets email usings strings.
   *
   * @param email list of strings
   * @return fluent builder
   */
  @CanIgnoreReturnValue
  public final PersonBuilder email(String... email) {
    return email(Arrays.stream(email).map(EmailAddress::of).collect(ImmutableSet.toImmutableSet()));
  }

  /**
   * Builds a person with the supplied parameters.
   *
   * @return person
   */
  public abstract Person build();
}
