package com.fillmore_labs.talk.value.composition.freebuilder;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class MovieTicket {
  /* package */ MovieTicket() {}

  public static Builder builder() {
    return new Builder();
  }

  public abstract String movieName();

  public abstract long serial();

  public static class Builder extends MovieTicket_Builder {}
}
