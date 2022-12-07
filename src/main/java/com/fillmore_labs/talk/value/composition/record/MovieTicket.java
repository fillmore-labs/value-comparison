package com.fillmore_labs.talk.value.composition.record;

import com.google.auto.value.AutoBuilder;
import java.util.Objects;

public record MovieTicket(String movieName, long serial) {
  public MovieTicket {
    Objects.requireNonNull(movieName, "movieName is a required parameter");
  }

  public static Builder builder() {
    return new AutoBuilder_MovieTicket_Builder();
  }

  @AutoBuilder(ofClass = MovieTicket.class)
  public abstract static class Builder {
    public abstract Builder movieName(String movieName);

    public abstract Builder serial(long serial);

    public abstract MovieTicket build();
  }
}
