package common

const val MIN_CREDENTIAL_LENGTH = 6

fun isEmployeeIdValid(username: String) = username.length >= MIN_CREDENTIAL_LENGTH
