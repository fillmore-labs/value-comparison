package com.fillmore_labs.talk.value.simple.scala

import org.apache.commons.validator.routines.EmailValidator

object EmailAddress {
  private val Validator: EmailValidator = EmailValidator.getInstance()

  /** Java API: Creates an e-mail address.
    *
    * @param address An address.
    * @return An e-mail address.
    */
  def of(address: String): EmailAddress = EmailAddress(address)
}

final case class EmailAddress private (address: String) {
  require(
    EmailAddress.Validator.isValid(address),
    s"$address is not a valid e-mail address"
  )

  /** Java API: The given name of this person. Everyone has one.
    *
    * @return An address.
    */
  def getAddress: String = address
}
