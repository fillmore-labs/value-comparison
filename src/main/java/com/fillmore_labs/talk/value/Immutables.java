package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.immutables.Person;

public final class Immutables {
  private Immutables() {}

  public static Person immutables() {
    return Person.builder()
        .givenName(Main.GIVEN_NAME)
        .surname(Main.SURNAME)
        .addEmail(Main.EMAIL, Main.EMAIL2)
        .build();
  }
}
