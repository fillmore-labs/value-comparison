package com.fillmore_labs.talk.value.inheritance.freebuilder;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
interface MovieTicket {
  static Builder builder() {
    return new Builder();
  }

  String movieName();

  long serial();

  class Builder extends MovieTicket_Builder {}
}
