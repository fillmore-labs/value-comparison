package com.fillmore_labs.talk.value.simple.record;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;
import java.util.Optional;

/** Representation of a person. */
@SuppressWarnings({"UnusedVariable", "FieldCanBeStatic"})
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
  public static PersonBuilder builder() {
    return PersonBuilder.builder();
  }
}
