fun main() {
    println("Введите нижнюю границу диапазона:")
    val lower = readLine()!!.toInt()
    println("Введите верхнюю границу диапазона:")
    val upper = readLine()!!.toInt()
    println("Простые числа от $lower до $upper:")
    for (number in lower..upper) {
        if (isPrime(number)) {
            println(number)
        }
    }
}
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}