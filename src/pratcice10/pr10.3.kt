fun caesarCipher(text: String, shift: Int): String {
    val result = StringBuilder()
    val normalizedShift = shift % 26
    for (char in text) {
        result.append(
            when {
                char.isLowerCase() -> ((char - 'a' + normalizedShift + 26) % 26 + 'a'.toInt()).toChar()
                char.isUpperCase() -> ((char - 'A' + normalizedShift + 26) % 26 + 'A'.toInt()).toChar()
                else -> char
            }
        )
    }
    return result.toString()
}
fun main() {
    val originalText = "Hello"
    val shift = 1
    val encryptedText = caesarCipher(originalText, shift)
    println("Исходный текст: ${caesarCipher(encryptedText, -shift)}")
    println("Зашифрованный: $encryptedText")
}