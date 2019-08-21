package matste.kotlin.demo

import java.time.Duration

data class Person(
    val name: String,
    val email: String?
)

fun sendEmail(to: String, body: String) {
    TODO()
}

fun welcome(person: Person) {
    if (person.email != null)
        sendEmail(person.email, "Hello ${person.name}")
}


fun javaInterop() {

    val dNullable: Duration? = Duration.ofMinutes(3)

    val dNonNullable: Duration = Duration.ofMinutes(2)

    val dInferred = Duration.ofMinutes(3)

}
