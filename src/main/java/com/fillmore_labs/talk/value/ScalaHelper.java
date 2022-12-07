package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.scala.Person;

public final class ScalaHelper {
  private ScalaHelper() {}

  public static Person person() {
    return Person.of(Constants.GIVEN_NAME, Constants.SURNAME, Constants.emails());
  }
}
