package com.fillmore_labs.talk.value;

/* package */ final class Constants {
  /* package */ static final String GIVEN_NAME = "Peter";
  /* package */ static final String SURNAME = "Pan";

  private static final String[] EMAILS = {"peter.pan@example.com", "wendy.darling@example.com"};

  private Constants() {}

  /* package */ static String[] emails() {
    return EMAILS.clone();
  }
}
