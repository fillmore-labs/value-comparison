package com.fillmore_labs.talk.value.inheritance.lombok;

import com.fillmore_labs.talk.value.simple.lombok.Person;
import com.google.errorprone.annotations.Immutable;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import org.checkerframework.checker.nullness.qual.NonNull;

@SuppressWarnings({
  "AnnotationPosition",
  "MissingBraces",
  "MissingOverride",
  "MissingSummary",
  "MultiVariableDeclaration",
  "SameNameButDifferent",
  "UnnecessarilyFullyQualified",
  "Var",
})
@Immutable
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Value
public class SoldMovieTicket extends MovieTicket {
  @NonNull Person owner;
}
