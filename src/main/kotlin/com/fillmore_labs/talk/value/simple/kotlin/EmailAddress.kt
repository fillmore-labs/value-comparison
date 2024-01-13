package com.fillmore_labs.talk.value.simple.kotlin

import org.apache.commons.validator.routines.EmailValidator

private val EMAIL_VALIDATOR: EmailValidator = EmailValidator.getInstance()

/**
 * A (validated) e-mail address.
 *
 * @param[address] Set the e-mail address.
 */
@Suppress("DataClassPrivateConstructor") // https://youtrack.jetbrains.com/issue/KT-11914
data class EmailAddress private constructor(val address: String) {
    init {
        require(EMAIL_VALIDATOR.isValid(address)) { "$address is not a valid e-mail address" }
    }

    companion object {
        @JvmStatic
        fun of(address: String) = EmailAddress(address)
    }
}
