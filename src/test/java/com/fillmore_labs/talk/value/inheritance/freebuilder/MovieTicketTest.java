package com.fillmore_labs.talk.value.inheritance.freebuilder;

import static com.google.common.truth.Truth.assertThat;

import com.fillmore_labs.talk.value.simple.freebuilder.Person;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

public final class MovieTicketTest {
  private static final String MOVIE_NAME = "The Favourite";
  private static final long SERIAL = 1L;

  private static MovieTicket createTicket(long l) {
    return MovieTicket.builder().movieName(MOVIE_NAME).serial(l).build();
  }

  private static ImmutableMap<MovieTicket, SoldMovieTicket> soldTickets() {
    var soldTicket =
        SoldMovieTicket.builder()
            .movieName(MOVIE_NAME)
            .serial(SERIAL)
            .owner(Person.builder().givenName("Charles").build())
            .build();

    return ImmutableMap.of(soldTicket, soldTicket);
  }

  @Test
  public void sellTicket() {
    var tickets = soldTickets();

    var ticket = createTicket(SERIAL);

    assertThat(tickets).doesNotContainKey(ticket);
  }
}
