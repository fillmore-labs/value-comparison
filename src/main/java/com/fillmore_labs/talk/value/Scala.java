package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.scala.Person;

public final class Scala {
  private Scala() {}

  public static Person scala() {
    return Person.of(Main.GIVEN_NAME, Main.SURNAME, Main.EMAIL, Main.EMAIL2);
  }
}
