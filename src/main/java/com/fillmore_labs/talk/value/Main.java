package com.fillmore_labs.talk.value;

import com.google.common.flogger.FluentLogger;

public final class Main {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private Main() {}

  public static void main(String... args) {
    logger.atInfo().log("Autovalue: %s", AutovalueHelper.person());
    logger.atInfo().log("FreeBuilder: %s", FreeBuilderHelper.person());
    logger.atInfo().log("Immutables: %s", ImmutablesHelper.person());
    logger.atInfo().log("Kotlin: %s", KotlinHelper.person());
    logger.atInfo().log("Lombok: %s", LombokHelper.person());
    logger.atInfo().log("Pojo: %s", PojoHelper.person());
    logger.atInfo().log("Record: %s", RecordHelper.person());
    logger.atInfo().log("Scala: %s", ScalaHelper.person());
  }
}
