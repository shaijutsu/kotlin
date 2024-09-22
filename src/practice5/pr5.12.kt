fun main() {
    println("Введите начальное число: ")
    val start = readLine()!!.toInt()
    println("Введите шаг: ")
    val step = readLine()!!.toInt()
    println("Сколько чисел нужно: ")
    val n = readLine()!!.toInt()
    var c = start
    for (i in 1..n) {
        println("$i. $c")
        c += step
    }
}