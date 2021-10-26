package com.fillmore_labs.talk.value.simple.record;

import com.google.common.base.Preconditions;
import org.apache.commons.validator.routines.EmailValidator;

/** A (validated) e-mail address. */
@SuppressWarnings({"UnusedVariable"})
public record EmailAddress(String address) {
  private static final EmailValidator EMAIL_VALIDATOR = EmailValidator.getInstance();

  public EmailAddress {
    Preconditions.checkState(
        EMAIL_VALIDATOR.isValid(address), "%s is not a valid e-mail address", address);
  }

  /**
   * Creates an e-mail address.
   *
   * @param address An address
   * @return An e-mail address
   */
  public static EmailAddress of(String address) {
    return new EmailAddress(address);
  }
}
