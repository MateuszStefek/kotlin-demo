package matste.kotlin.demo

class Account(val name: String, val email: String)

interface EmailValidationService {
    fun isEmailValidated(email: String): Boolean
}

val dao: EmailValidationService = TODO()

fun Account.isValidated(): Boolean {
    if (name == "admin") return true
    return dao.isEmailValidated(email)
}
