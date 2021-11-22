package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.freebuilder.Person;

public final class FreeBuilderHelper {
  private FreeBuilderHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Main.GIVEN_NAME)
        .surname(Main.SURNAME)
        .addEmail(Main.EMAIL, Main.EMAIL2)
        .build();
  }
}
