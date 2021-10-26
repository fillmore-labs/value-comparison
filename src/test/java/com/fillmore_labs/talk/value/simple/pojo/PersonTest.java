package com.fillmore_labs.talk.value.simple.pojo;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth8.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public final class PersonTest {
  @Test
  public void creation() {
    var person = Person.of("Peter", "Pan", "peter.pan@example.com");

    assertThat(person.givenName()).isEqualTo("Peter");

    assertThat(person.surname()).hasValue("Pan");

    assertThat(person.email()).containsExactly(EmailAddress.of("peter.pan@example.com"));
  }

  @Test
  public void defaults() {
    var person = Person.of("Charles", null);

    assertThat(person.givenName()).isEqualTo("Charles");

    assertThat(person.surname()).isEmpty();

    assertThat(person.email()).isEmpty();
  }

  @Test
  @SuppressWarnings("NullAway")
  public void notNull() {
    var ex = assertThrows(NullPointerException.class, () -> Person.of(null, null));
    assertThat(ex).hasMessageThat().contains("givenName");
  }
}
