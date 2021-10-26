package com.fillmore_labs.talk.value.simple.freebuilder;

import com.google.common.base.Preconditions;
import org.apache.commons.validator.routines.EmailValidator;
import org.inferred.freebuilder.FreeBuilder;

/** A (validated) e-mail address. */
@FreeBuilder
public abstract class EmailAddress {
  /* package */ EmailAddress() {}

  /**
   * Creates an e-mail address.
   *
   * @param address An address
   * @return An e-mail address
   */
  public static EmailAddress of(String address) {
    return new Builder().address(address).build();
  }

  /**
   * The e-mail address.
   *
   * @return The address.
   */
  public abstract String address();

  /** Builder of an e-mail address instance. */
  /* package */ static class Builder extends EmailAddress_Builder {
    private static final EmailValidator EMAIL_VALIDATOR = EmailValidator.getInstance();

    @Override
    public EmailAddress build() {
      var emailAddress = super.build();
      var address = emailAddress.address();
      Preconditions.checkState(
          EMAIL_VALIDATOR.isValid(address), "%s is not a valid e-mail address", address);
      return emailAddress;
    }
  }
}
