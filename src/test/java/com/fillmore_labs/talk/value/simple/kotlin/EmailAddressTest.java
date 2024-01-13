package com.fillmore_labs.talk.value.simple.kotlin;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EmailAddressTest {
  private static final String EXAMPLE_EMAIL = "peter.pan@example.com";
  private static final String ADDRESS = "address";

  @Test
  public void creation() {
    var email = EmailAddress.of(EXAMPLE_EMAIL);

    assertThat(email.getAddress()).isEqualTo(EXAMPLE_EMAIL);
  }

  @Test
  public void valid() {
    var ex = assertThrows(IllegalArgumentException.class, () -> EmailAddress.of("null"));
    assertThat(ex).hasMessageThat().contains(ADDRESS);
  }

  @Test
  public void copyValid() {
    var email = EmailAddress.of(EXAMPLE_EMAIL);
    var ex = assertThrows(IllegalArgumentException.class, () -> email.copy("null"));
    assertThat(ex).hasMessageThat().contains(ADDRESS);
  }

  @Test
  @SuppressWarnings("nullness:argument")
  public void notNull() {
    var ex = assertThrows(NullPointerException.class, () -> EmailAddress.of(null));
    assertThat(ex).hasMessageThat().contains(ADDRESS);
  }

  @Test
  @SuppressWarnings("nullness:argument")
  public void copyNotNull() {
    var email = EmailAddress.of(EXAMPLE_EMAIL);
    var ex = assertThrows(NullPointerException.class, () -> email.copy(null));
    assertThat(ex).hasMessageThat().contains(ADDRESS);
  }
}
