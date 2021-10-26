package com.fillmore_labs.talk.value.inheritance.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.fillmore_labs.talk.value.simple.immutables.Person;
import com.google.errorprone.annotations.Immutable;
import org.immutables.value.Value;

@SuppressWarnings("immutables:subtype")
@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable
public interface SoldMovieTicket extends MovieTicket, WithSoldMovieTicket {
  static Builder builder() {
    return new Builder();
  }

  Person owner();

  final class Builder extends ImmutableSoldMovieTicket.Builder {}
}
