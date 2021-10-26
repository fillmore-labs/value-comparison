package com.fillmore_labs.talk.value.simple.kotlin

/**
 * Representation of a person.
 *
 * @param[givenName] Set the given name. Required.
 * @param[surname] Set the surname. Optional, i.e for royalty.
 * @param[email] Email addresses this person is reachable under. Optional.
 */
data class Person(
  val givenName: String,
  val surname: String?,
  val email: Set<EmailAddress> = emptySet()
) {
  companion object {
    @JvmStatic
    fun of(
      givenName: String,
      surname: String?,
      vararg email: String
    ) = Person(givenName, surname, email.asIterable().map { EmailAddress.of(it) }.toSet())
  }
}
