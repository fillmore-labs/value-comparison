package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.lombok.EmailAddress;
import com.fillmore_labs.talk.value.simple.lombok.Person;

public final class Lombok {
  private Lombok() {}

  public static Person lombok() {
    return Person.builder()
        .givenName(Main.GIVEN_NAME)
        .surname(Main.SURNAME)
        .email(EmailAddress.of(Main.EMAIL))
        .email(EmailAddress.of(Main.EMAIL2))
        .build();
  }
}
