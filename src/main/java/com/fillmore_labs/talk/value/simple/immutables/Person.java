package com.fillmore_labs.talk.value.simple.immutables;

import static org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE;

import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Optional;
import org.immutables.value.Value;

/** Representation of a person. */
@Immutable
@Value.Style(
    passAnnotations = {Immutable.class},
    visibility = PACKAGE)
@Value.Immutable
public abstract class Person {
  /* package */ Person() {}

  /**
   * Creates a Person builder.
   *
   * @return A new builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * The given name of this person. Everyone has one.
   *
   * @return A name.
   */
  public abstract String givenName();

  /**
   * The surname name of this person. Optional, i.e for royalty.
   *
   * @return An optional name
   */
  public abstract Optional<String> surname();

  /**
   * Email addresses this person is reachable under.
   *
   * @return An immutable set of email addresses
   */
  public abstract ImmutableSet<EmailAddress> email();

  public static final class Builder extends ImmutablePerson.Builder {
    /**
     * Email addresses this person is reachable under. Optional. Convenience function mapping {@link
     * String} to {@link EmailAddress}
     *
     * @param email Emails
     * @return This builder
     */
    @SuppressWarnings("ParameterPackage")
    public Builder addEmail(String... email) {
      return addAllEmail(
          Arrays.stream(email).map(EmailAddress::of).collect(ImmutableSet.toImmutableSet()));
    }
  }
}
