package com.fillmore_labs.talk.value.simple.lombok;

import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.Immutable;
import java.util.Optional;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/** Representation of a person. */
@SuppressWarnings({
  "FieldMissingNullable",
  "MissingBraces",
  "MultiVariableDeclaration",
  "SameNameButDifferent",
  "UnnecessarilyFullyQualified",
  "Var",
  "allcheckers:type.anno.before",
  "nullness:assignment",
  "nullness:initialization.fields.uninitialized",
})
@Value
@Builder
@Immutable
public class Person {
  /** The given name of this person. Everyone has one. */
  @NonNull String givenName;

  /** The surname name of this person. Optional, i.e for royalty. */
  @Nullable String surname;

  /** Email addresses this person is reachable under. */
  @Singular("email")
  ImmutableSet<EmailAddress> email;

  /**
   * The surname name of this person. Optional, i.e for royalty.
   *
   * @return An optional name
   */
  public Optional<String> surname() {
    return Optional.ofNullable(surname);
  }
}
