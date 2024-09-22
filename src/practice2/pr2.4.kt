import kotlin.math.pow
fun main() {
    print("Введите число: ")
    var a = readLine()!!.toDouble()
    print("Введите степень для числа: ")
    val b = readLine()!!.toInt()
    print("$a в степени $b = ${a.pow(b)}")
}