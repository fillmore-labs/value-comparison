package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.lombok.EmailAddress;
import com.fillmore_labs.talk.value.simple.lombok.Person;
import java.util.Arrays;

public final class LombokHelper {
  private LombokHelper() {}

  public static Person person() {
    return Person.builder()
        .givenName(Constants.GIVEN_NAME)
        .surname(Constants.SURNAME)
        .email(Arrays.stream(Constants.emails()).map(EmailAddress::of).toList())
        .build();
  }
}
