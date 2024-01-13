package com.fillmore_labs.talk.value.simple.scala

import org.checkerframework.checker.nullness.qual.Nullable

import java.util
import scala.annotation.varargs
import scala.collection.immutable
import scala.jdk.CollectionConverters._
import scala.jdk.OptionConverters._

private object Person {

  /** Java API: Construct a person
    *
    * @param givenName The given name. Required.
    * @param surname   The surname. Optional, i.e for royalty.
    * @param email     Email addresses this person is reachable under. Optional.
    */
  @varargs
  def of(givenName: String, @Nullable surname: String, email: String*): Person =
    Person(
      util.Objects.requireNonNull(givenName),
      Option(surname),
      email.map(EmailAddress.of).toSet
    )
}

final case class Person private (
    givenName: String,
    surname: Option[String] = None,
    email: immutable.Set[EmailAddress] = Set.empty
) {

  /** Java API: The given name of this person. Everyone has one.
    *
    * @return A name.
    */
  def getGivenName: String = givenName

  /** Java API: The surname of this person. Optional, i.e for royalty.
    *
    * @return An optional name
    */
  def getSurname: util.Optional[String] = surname.toJava

  /** Java API: Email addresses this person is reachable under.
    *
    * @return An immutable set of email addresses
    */
  def getEmail: util.Set[EmailAddress] = email.asJava
}
