package com.fillmore_labs.talk.value.simple.kotlin;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EmailAddressTest {
  @Test
  public void creation() {
    var email = EmailAddress.of("peter.pan@example.com");

    assertThat(email.getAddress()).isEqualTo("peter.pan@example.com");
  }

  @Test
  public void valid() {
    var ex = assertThrows(IllegalArgumentException.class, () -> EmailAddress.of("null"));
    assertThat(ex).hasMessageThat().contains("address");
  }

  @Test
  public void copyValid() {
    var email = EmailAddress.of("peter.pan@example.com");
    var ex = assertThrows(IllegalArgumentException.class, () -> email.copy("null"));
    assertThat(ex).hasMessageThat().contains("address");
  }

  @Test
  @SuppressWarnings("NullAway")
  public void notNull() {
    var ex = assertThrows(NullPointerException.class, () -> EmailAddress.of(null));
    assertThat(ex).hasMessageThat().contains("address");
  }

  @Test
  @SuppressWarnings("NullAway")
  public void copyNotNull() {
    var email = EmailAddress.of("peter.pan@example.com");
    var ex = assertThrows(NullPointerException.class, () -> email.copy(null));
    assertThat(ex).hasMessageThat().contains("address");
  }
}
