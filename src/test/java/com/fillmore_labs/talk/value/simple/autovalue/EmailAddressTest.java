package com.fillmore_labs.talk.value.simple.autovalue;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EmailAddressTest {
  @Test
  public void creation() {
    var email = EmailAddress.of("peter.pan@example.com");

    assertThat(email.address()).isEqualTo("peter.pan@example.com");
  }

  @Test
  public void valid() {
    var ex = assertThrows(IllegalStateException.class, () -> EmailAddress.of("null"));
    assertThat(ex).hasMessageThat().contains("address");
  }

  @Test
  @SuppressWarnings("nullness:argument")
  public void notNull() {
    var ex = assertThrows(NullPointerException.class, () -> EmailAddress.of(null));
    assertThat(ex).hasMessageThat().contains("address");
  }
}
