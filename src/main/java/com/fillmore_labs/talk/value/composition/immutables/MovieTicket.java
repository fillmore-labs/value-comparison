package com.fillmore_labs.talk.value.composition.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.google.errorprone.annotations.Immutable;
import org.immutables.value.Value;

@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable
public abstract class MovieTicket implements WithMovieTicket {
  /* package */ MovieTicket() {}

  public static Builder builder() {
    return new Builder();
  }

  public abstract String movieName();

  public abstract long serial();

  public static final class Builder extends ImmutableMovieTicket.Builder {}
}
