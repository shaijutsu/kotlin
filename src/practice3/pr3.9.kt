fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    if (m % n == 0) print("${m / n} - частное")
    else print("$m на $n нацело не делится")
}
