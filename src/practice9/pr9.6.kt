fun main() {
    println("Введите количество строк:")
    val count = readLine()?.toIntOrNull() ?: return println("Некорректный ввод.")
    val strings = mutableListOf<String>()
    for (i in 1..count) {
        println("Введите строку $i:")
        val inputString = readLine() ?: ""
        strings.add(inputString)
    }
    val sortedStrings = strings.sorted()
    println("Отсортированные строки:")
    sortedStrings.forEach { println(it) }
}