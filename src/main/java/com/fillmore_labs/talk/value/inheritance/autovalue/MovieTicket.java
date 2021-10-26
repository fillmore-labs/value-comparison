package com.fillmore_labs.talk.value.inheritance.autovalue;

import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.Immutable;

@Immutable
public abstract class MovieTicket {
  /* package */ MovieTicket() {}

  public static Builder<?> builder() {
    return AvailableMovieTicket.builder();
  }

  public abstract String movieName();

  public abstract long serial();

  public abstract static class Builder<T extends MovieTicket.Builder<T>> {
    public abstract T movieName(String movieName);

    public abstract T serial(long serial);

    public abstract MovieTicket build();
  }

  @Immutable
  @AutoValue
  public abstract static class AvailableMovieTicket extends MovieTicket {
    /* package */ AvailableMovieTicket() {}

    public static Builder builder() {
      return new AutoValue_MovieTicket_AvailableMovieTicket.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder extends MovieTicket.Builder<Builder> {
      @Override
      public abstract AvailableMovieTicket build();
    }
  }
}
