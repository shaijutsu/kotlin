fun main() {
    val a = readLine()!!.toInt()
    val ed = a % 10
    val des = a % 100 / 10
    val sot = a / 100
    val sum = ed + des + sot
    val pro = ed * des * sot

    println("Единиц: $ed")
    println("Десятков: $des")
    println("Сумма: $sum")
    println("Произведение: $pro")
}