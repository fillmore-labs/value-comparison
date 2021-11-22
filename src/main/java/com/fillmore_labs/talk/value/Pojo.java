package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.pojo.Person;

public final class Pojo {
  private Pojo() {}

  public static Person pojo() {
    return Person.of(Main.GIVEN_NAME, Main.SURNAME, Main.EMAIL, Main.EMAIL2);
  }
}
