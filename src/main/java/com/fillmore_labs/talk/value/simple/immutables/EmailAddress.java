package com.fillmore_labs.talk.value.simple.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import org.apache.commons.validator.routines.EmailValidator;
import org.immutables.value.Value;

/** A (validated) e-mail address. */
@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable(builder = false)
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
    return ImmutableEmailAddress.of(address);
  }

  /**
   * The e-mail address.
   *
   * @return The address.
   */
  @Value.Parameter
  public abstract String address();

  @Value.Check
  /* package */ void check() {
    var address = address();
    Preconditions.checkState(
        EMAIL_VALIDATOR.isValid(address), "%s is not a valid e-mail address", address);
  }
}
