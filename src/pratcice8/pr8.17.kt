fun fact(a: Int){
    var fac = 1
    for (i in 1..a) {
        fac *= i
    }
    println(fac)
}
fun main() {
    println("Введите число: ")
    val a = readln().toInt()
    fact(a)
}