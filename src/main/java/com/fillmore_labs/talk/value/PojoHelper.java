package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.pojo.Person;

public final class PojoHelper {
  private PojoHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Constants.GIVEN_NAME)
        .surname(Constants.SURNAME)
        .email(Constants.EMAIL, Constants.EMAIL2)
        .build();
  }
}
