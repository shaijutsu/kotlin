fun main() {
    println("Введите целое число: ")
    val num = readLine()!!.toInt()
    val dv = Integer.toBinaryString(num)
    println("$num в двоичной системе = $dv")
}