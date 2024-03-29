package com.fillmore_labs.talk.value.composition.lombok;

import com.fillmore_labs.talk.value.simple.lombok.Person;
import com.google.errorprone.annotations.Immutable;
import lombok.Builder;
import lombok.Value;
import org.checkerframework.checker.nullness.qual.NonNull;

@SuppressWarnings({
  "AnnotationPosition",
  "MissingBraces",
  "MissingSummary",
  "MultiVariableDeclaration",
  "SameNameButDifferent",
  "UnnecessarilyFullyQualified",
  "Var",
  "allcheckers:type.anno.before.decl.anno",
  "allcheckers:type.anno.before.modifier",
  "nullness:initialization.fields.uninitialized",
})
@Immutable
@Builder
@Value
public class SoldMovieTicket {
  @NonNull MovieTicket ticket;
  @NonNull Person owner;
}
