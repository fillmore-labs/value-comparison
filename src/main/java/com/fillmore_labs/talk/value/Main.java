package com.fillmore_labs.talk.value;

import com.google.common.flogger.FluentLogger;

public final class Main {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private static final String EMAIL = "peter.pan@example.com";
  private static final String EMAIL2 = "wendy.darling@example.com";
  private static final String SURNAME = "Pan";
  private static final String GIVEN_NAME = "Peter";

  private Main() {}

  public static void main(String... args) {
    logger.atInfo().log("Autovalue: %s", autovalue());
    logger.atInfo().log("FreeBuilder: %s", freebuilder());
    logger.atInfo().log("Immutables: %s", immutables());
    logger.atInfo().log("Lombok: %s", lombok());
    logger.atInfo().log("Pojo: %s", pojo());
    logger.atInfo().log("Record: %s", record());
    logger.atInfo().log("Scala: %s", scala());
  }

  private static com.fillmore_labs.talk.value.simple.autovalue.Person autovalue() {
    return com.fillmore_labs.talk.value.simple.autovalue.Person.builder()
        .givenName(GIVEN_NAME)
        .surname(SURNAME)
        .email(EMAIL, EMAIL2)
        .build();
  }

  private static com.fillmore_labs.talk.value.simple.freebuilder.Person freebuilder() {
    return com.fillmore_labs.talk.value.simple.freebuilder.Person.builder()
        .givenName(GIVEN_NAME)
        .surname(SURNAME)
        .addEmail(EMAIL, EMAIL2)
        .build();
  }

  private static com.fillmore_labs.talk.value.simple.immutables.Person immutables() {
    return com.fillmore_labs.talk.value.simple.immutables.Person.builder()
        .givenName(GIVEN_NAME)
        .surname(SURNAME)
        .addEmail(EMAIL, EMAIL2)
        .build();
  }

  @SuppressWarnings("UnnecessarilyFullyQualified")
  private static com.fillmore_labs.talk.value.simple.lombok.Person lombok() {
    return com.fillmore_labs.talk.value.simple.lombok.Person.builder()
        .givenName(GIVEN_NAME)
        .surname(SURNAME)
        .email(com.fillmore_labs.talk.value.simple.lombok.EmailAddress.of(EMAIL))
        .email(com.fillmore_labs.talk.value.simple.lombok.EmailAddress.of(EMAIL2))
        .build();
  }

  private static com.fillmore_labs.talk.value.simple.pojo.Person pojo() {
    return com.fillmore_labs.talk.value.simple.pojo.Person.of(GIVEN_NAME, SURNAME, EMAIL, EMAIL2);
  }

  private static com.fillmore_labs.talk.value.simple.record.Person record() {
    return com.fillmore_labs.talk.value.simple.record.Person.of(GIVEN_NAME, SURNAME, EMAIL, EMAIL2);
  }

  private static com.fillmore_labs.talk.value.simple.scala.Person scala() {
    return com.fillmore_labs.talk.value.simple.scala.Person.of(GIVEN_NAME, SURNAME, EMAIL, EMAIL2);
  }
}
