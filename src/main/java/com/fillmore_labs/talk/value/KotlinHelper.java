package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.kotlin.Person;

public final class KotlinHelper {
  private KotlinHelper() {}

  public static Person person() {
    return Person.of(Constants.GIVEN_NAME, Constants.SURNAME, Constants.EMAIL, Constants.EMAIL2);
  }
}
