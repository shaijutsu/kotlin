fun findLongestWord(input: String): String {
    val words = input.split(Regex("\\W+"))
    return words.filter { it.isNotEmpty() }
        .maxByOrNull { it.length } ?: ""
}
fun main() {
    print("Введите слова на латинском через пробел: ")
    val inputString = readln()
    val longestWord = findLongestWord(inputString)
    println("Самое длинное слово: $longestWord")
}
