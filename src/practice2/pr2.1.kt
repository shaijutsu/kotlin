fun main() {
    val a = readLine()!!.toInt()
    val des = a / 10
    val ed = a % 10
    val sum = des + ed
    val pro = des * ed

    println("Десятков: $des")
    println("Единиц: $ed")
    println("Сумма: $sum")
    println("Произведение: $pro ")


}