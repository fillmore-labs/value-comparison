package com.fillmore_labs.talk.value.simple.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.apache.commons.validator.routines.EmailValidator;
import org.checkerframework.checker.nullness.qual.Nullable;

/** A (validated) e-mail address. */
@Immutable
public final class EmailAddress {
  private static final EmailValidator EMAIL_VALIDATOR = EmailValidator.getInstance();

  private final String address;

  private EmailAddress(String address) {
    this.address = address;
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

  /**
   * The e-mail address.
   *
   * @return The address.
   */
  public String address() {
    return address;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }

  @Override
  @SuppressWarnings("OperatorPrecedence")
  public boolean equals(@Nullable Object obj) {
    return obj == this || obj instanceof EmailAddress e && address.equals(e.address);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("address", address).toString();
  }
}
