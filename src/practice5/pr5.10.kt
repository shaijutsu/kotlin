fun main() {
    println("Введите число: ")
    val num = readLine() ?: return
    val sum = num.filter { it.isDigit() }.map { it.toString().toInt() }.sum()
    print("Сумма цифр = $sum")
}