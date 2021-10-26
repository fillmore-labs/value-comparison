package com.fillmore_labs.talk.value.inheritance.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.google.errorprone.annotations.Immutable;
import org.immutables.value.Value;

@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable
public interface MovieTicket extends WithMovieTicket {
  static Builder builder() {
    return new Builder();
  }

  String movieName();

  long serial();

  final class Builder extends ImmutableMovieTicket.Builder {}
}
