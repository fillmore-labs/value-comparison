package com.fillmore_labs.talk.value.simple.record;

import com.google.auto.value.AutoBuilder;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.Nullable;

@AutoBuilder(ofClass = Person.class)
public abstract class PersonBuilder {
  /* package */ static PersonBuilder builder() {
    return new AutoBuilder_PersonBuilder().email(ImmutableSet.of());
  }

  /**
   * Sets the given name (required).
   *
   * @param name give name
   * @return fluent builder
   */
  public abstract PersonBuilder givenName(String name);

  /**
   * Sets the surname (optional).
   *
   * @param name surname
   * @return fluent builder
   */
  public abstract PersonBuilder surname(@Nullable String name);

  /**
   * Sets the email (optional).
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
