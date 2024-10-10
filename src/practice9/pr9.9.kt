import kotlin.random.Random
fun generatePassword(length: Int): String {
    val lowercaseLetters = ('a'..'z').toList()
    val uppercaseLetters = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val specialCharacters = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '{', '}', '[', ']', '|', ':', ';', '"', "'", '<', '>', ',', '.', '?', '/')
    val allCharacters = lowercaseLetters + uppercaseLetters + digits + specialCharacters
    val password = StringBuilder()
    for (i in 0 until length) {
        val randomIndex = Random.nextInt(allCharacters.size)
        password.append(allCharacters[randomIndex])
    }
    return password.toString()
}
fun main() {
    println("Введите длину пароля:")
    val userInput = readLine()
    val length = userInput?.toIntOrNull()
    if (length != null && length > 0) {
        val password = generatePassword(length)
        println("Сгенерированный пароль: $password")
    }
}