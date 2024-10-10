fun main() {
    println("Введите строку: ")
    val input = readLine() ?: ""
    val Input = input.replace("\\s+".toRegex(), "").toLowerCase()
    var glas = 0
    var sogl = 0
    val vowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    for (char in Input) {
        if (char.isLetter()) {
            if (char in vowels) {
                glas++
            } else {
                sogl++
            }
        }
    }
    println("гласных букв: $glas")
    println("согласных букв: $sogl")
}