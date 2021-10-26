package com.fillmore_labs.talk.value.composition.autovalue;

import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.Immutable;

@Immutable
@AutoValue
public abstract class MovieTicket {
  /* package */ MovieTicket() {}

  public static Builder builder() {
    return new AutoValue_MovieTicket.Builder();
  }

  public abstract String movieName();

  public abstract long serial();

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder movieName(String movieName);

    public abstract Builder serial(long serial);

    public abstract MovieTicket build();
  }
}
