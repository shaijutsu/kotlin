fun main() {
    val n = readln().toInt();
    var fact = 1
    for (i in 1..n)
        fact *= i
    println(fact)
}