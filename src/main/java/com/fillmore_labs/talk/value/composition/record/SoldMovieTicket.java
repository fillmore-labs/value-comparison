package com.fillmore_labs.talk.value.composition.record;

import com.fillmore_labs.talk.value.simple.record.Person;
import com.google.auto.value.AutoBuilder;
import java.util.Objects;

public record SoldMovieTicket(MovieTicket ticket, Person owner) {
  public SoldMovieTicket {
    Objects.requireNonNull(ticket, "ticket is a required parameter");
    Objects.requireNonNull(owner, "owner is a required parameter");
  }

  public static Builder builder() {
    return new AutoBuilder_SoldMovieTicket_Builder();
  }

  @AutoBuilder(ofClass = SoldMovieTicket.class)
  public abstract static class Builder {
    public abstract Builder ticket(MovieTicket ticket);

    public abstract Builder owner(Person owner);

    public abstract SoldMovieTicket build();
  }
}
