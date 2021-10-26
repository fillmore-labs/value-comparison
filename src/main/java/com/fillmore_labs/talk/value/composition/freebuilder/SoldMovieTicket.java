package com.fillmore_labs.talk.value.composition.freebuilder;

import com.fillmore_labs.talk.value.simple.freebuilder.Person;
import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class SoldMovieTicket {
  /* package */ SoldMovieTicket() {}

  public static Builder builder() {
    return new Builder();
  }

  public abstract MovieTicket ticket();

  public abstract Person owner();

  public static class Builder extends SoldMovieTicket_Builder {}
}
