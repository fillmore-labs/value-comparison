package com.fillmore_labs.talk.value.simple.autovalue;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.apache.commons.validator.routines.EmailValidator;

/** A (validated) e-mail address. */
@Immutable
@AutoValue
public abstract class EmailAddress {
  private static final EmailValidator EMAIL_VALIDATOR = EmailValidator.getInstance();

  /* package */ EmailAddress() {}

  /**
   * Creates an e-mail address.
   *
   * @param address An address
   * @return An e-mail address
   */
  public static EmailAddress of(String address) {
    Objects.requireNonNull(address, "Null address"); // Avoid an API change
    Preconditions.checkState(
        EMAIL_VALIDATOR.isValid(address), "%s is not a valid e-mail address", address);
    return new AutoValue_EmailAddress(address);
  }

  /**
   * The e-mail address.
   *
   * @return The address.
   */
  public abstract String address();
}
