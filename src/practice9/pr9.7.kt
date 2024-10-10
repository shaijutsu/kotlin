fun main() {
    println("Введите строку:")
    val input = readLine() ?: return println("Некорректный ввод.")
    val toggled = toggle(input)
    println("Результат: $toggled")
}
fun toggle(str: String): String {
    return str.map {
        when {
            it.isUpperCase() -> it.lowercaseChar()
            it.isLowerCase() -> it.uppercaseChar()
            else -> it
        }
    }.joinToString("")
}