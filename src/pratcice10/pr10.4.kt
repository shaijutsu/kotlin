fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        when {
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизллллл")
            i % 15 == 0 -> result.add("ВизллБизлл")
            else -> result.add(i.toString())
        }
    }
    return result
}
fun main() {
    println("Введите n: ")
    val n = readln().toInt()
    val result = fizzBuzz(n)
    println(result.joinToString(", "))
}