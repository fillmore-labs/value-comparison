package com.fillmore_labs.talk.value.inheritance.freebuilder;

import com.fillmore_labs.talk.value.simple.freebuilder.Person;
import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface SoldMovieTicket extends MovieTicket {
  static Builder builder() {
    return new Builder();
  }

  Person owner();

  class Builder extends SoldMovieTicket_Builder {}
}
