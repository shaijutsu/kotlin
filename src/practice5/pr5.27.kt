fun main() {
    println("Введите N:")
    val n = readLine()?.toInt()
    println("Пирамида чисел от 1 до $n:")
    for (i in 1..n!!) {
        print(" ".repeat(n - i))
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}