package example.epsi.com.go_securi.common

const val MIN_CREDENTIAL_LENGTH = 6

fun isEmployeeIdValid(username: String) = username.length >= MIN_CREDENTIAL_LENGTH

fun isEmailValid(email: String) = email.length >= MIN_CREDENTIAL_LENGTH

fun isPasswordValid(password: String) = password.length >= MIN_CREDENTIAL_LENGTH
