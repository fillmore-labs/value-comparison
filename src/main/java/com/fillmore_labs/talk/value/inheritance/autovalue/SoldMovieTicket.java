package com.fillmore_labs.talk.value.inheritance.autovalue;

import com.fillmore_labs.talk.value.simple.autovalue.Person;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.Immutable;

@Immutable
@AutoValue
public abstract class SoldMovieTicket extends MovieTicket {

  /* package */ SoldMovieTicket() {}

  public static Builder builder() {
    return new AutoValue_SoldMovieTicket.Builder();
  }

  public abstract Person owner();

  @AutoValue.Builder
  public abstract static class Builder extends MovieTicket.Builder<Builder> {

    public abstract Builder owner(Person owner);

    @Override
    public abstract SoldMovieTicket build();
  }
}
