package com.fillmore_labs.talk.value.composition.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.fillmore_labs.talk.value.simple.immutables.Person;
import com.google.errorprone.annotations.Immutable;
import org.immutables.value.Value;

@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable
public abstract class SoldMovieTicket implements WithSoldMovieTicket {
  /* package */ SoldMovieTicket() {}

  public static Builder builder() {
    return new Builder();
  }

  public abstract MovieTicket ticket();

  public abstract Person owner();

  public static final class Builder extends ImmutableSoldMovieTicket.Builder {}
}
