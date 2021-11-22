package com.fillmore_labs.talk.value;

import com.google.common.flogger.FluentLogger;

public final class Main {
  /* package */ static final String GIVEN_NAME = "Peter";
  /* package */ static final String SURNAME = "Pan";
  /* package */ static final String EMAIL = "peter.pan@example.com";
  /* package */ static final String EMAIL2 = "wendy.darling@example.com";

  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private Main() {}

  public static void main(String... args) {
    logger.atInfo().log("Autovalue: %s", Autovalue.autovalue());
    logger.atInfo().log("FreeBuilder: %s", FreeBuilder.freebuilder());
    logger.atInfo().log("Immutables: %s", Immutables.immutables());
    logger.atInfo().log("Lombok: %s", Lombok.lombok());
    logger.atInfo().log("Pojo: %s", Pojo.pojo());
    logger.atInfo().log("Record: %s", Records.record());
    logger.atInfo().log("Scala: %s", Scala.scala());
  }
}
