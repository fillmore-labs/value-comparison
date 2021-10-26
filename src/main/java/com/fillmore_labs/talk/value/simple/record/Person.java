package com.fillmore_labs.talk.value.simple.record;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.checkerframework.checker.nullness.qual.Nullable;

/** Representation of a person. */
@SuppressWarnings({
  "nullness:initialization.fields.uninitialized",
  "optional:optional.field",
  "optional:optional.parameter",
  "UnusedVariable",
  "FieldCanBeStatic"
})
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
   * Creates a Person.
   *
   * @param givenName Set the given name. Required.
   * @param surname Set the surname. Optional, i.e for royalty.
   * @param email Email addresses this person is reachable under. Optional.
   * @return A person.
   */
  public static Person of(String givenName, @Nullable String surname, String... email) {
    return new Person(
        givenName,
        Optional.ofNullable(surname),
        Arrays.stream(email).map(EmailAddress::of).collect(ImmutableSet.toImmutableSet()));
  }
}
