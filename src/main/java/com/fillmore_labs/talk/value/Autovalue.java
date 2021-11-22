package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.autovalue.Person;

public final class Autovalue {
  private Autovalue() {}

  public static Person autovalue() {
    return Person.builder()
        .givenName(Main.GIVEN_NAME)
        .surname(Main.SURNAME)
        .email(Main.EMAIL, Main.EMAIL2)
        .build();
  }
}
