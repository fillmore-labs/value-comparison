package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.autovalue.Person;

public final class AutovalueHelper {
  private AutovalueHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Constants.GIVEN_NAME)
        .surname(Constants.SURNAME)
        .email(Constants.emails())
        .build();
  }
}
