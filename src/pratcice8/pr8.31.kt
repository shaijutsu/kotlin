fun farengeit(c: Double): Double {
    return (((c * 9) / 5)  + 32)
}
fun main(){
    println("Введите температуру в Цельсиях: ")
    val c = readln().toDouble()
    println("Температура в Фаренгейтах:${(farengeit(c))}")
}