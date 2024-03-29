package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.record.Person;

public final class RecordHelper {
  private RecordHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Constants.GIVEN_NAME)
        .surname(Constants.SURNAME)
        .email(Constants.emails())
        .build();
  }
}
