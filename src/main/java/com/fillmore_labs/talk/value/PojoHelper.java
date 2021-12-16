package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.pojo.Person;

public final class PojoHelper {
  private PojoHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Main.GIVEN_NAME)
        .surname(Main.SURNAME)
        .email(Main.EMAIL, Main.EMAIL2)
        .build();
  }
}
