package com.fillmore_labs.talk.value.simple.kotlin;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public final class PersonTest {
  @Test
  public void creation() {
    var person = Person.of("Peter", "Pan", "peter.pan@example.com");

    assertThat(person.getGivenName()).isEqualTo("Peter");

    assertThat(person.getSurname()).isEqualTo("Pan");

    assertThat(person.getEmail()).containsExactly(EmailAddress.of("peter.pan@example.com"));
  }

  @Test
  public void defaults() {
    var person = Person.of("Charles", null);

    assertThat(person.getGivenName()).isEqualTo("Charles");

    assertThat(person.getSurname()).isNull();

    assertThat(person.getEmail()).isEmpty();
  }

  @Test
  @SuppressWarnings("nullness:argument")
  public void notNull() {
    var ex = assertThrows(NullPointerException.class, () -> Person.of(null, null));
    assertThat(ex).hasMessageThat().contains("givenName");
  }
}
