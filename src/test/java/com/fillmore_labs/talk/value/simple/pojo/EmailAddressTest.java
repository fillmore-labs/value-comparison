package com.fillmore_labs.talk.value.simple.pojo;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import nl.jqno.equalsverifier.EqualsVerifier;
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
  @SuppressWarnings("NullAway")
  public void notNull() {
    var ex = assertThrows(IllegalStateException.class, () -> EmailAddress.of(null));
    assertThat(ex).hasMessageThat().contains("address");
  }

  @Test
  public void equals() {
    EqualsVerifier.forClass(EmailAddress.class).withNonnullFields("address").verify();
  }

  @Test
  public void string() {
    var email = EmailAddress.of("peter.pan@example.com");

    assertThat(email.toString()).isNotEmpty();
  }
}
