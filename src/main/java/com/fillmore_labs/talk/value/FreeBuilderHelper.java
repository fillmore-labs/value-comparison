package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.freebuilder.Person;

public final class FreeBuilderHelper {
  private FreeBuilderHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Constants.GIVEN_NAME)
        .surname(Constants.SURNAME)
        .addEmail(Constants.emails())
        .build();
  }
}
