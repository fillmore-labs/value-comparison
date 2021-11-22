package com.fillmore_labs.talk.value;

import com.fillmore_labs.talk.value.simple.record.Person;

public final class RecordHelper {
  private RecordHelper() {}

  public static Person person() {
    return Person.of(Main.GIVEN_NAME, Main.SURNAME, Main.EMAIL, Main.EMAIL2);
  }
}
