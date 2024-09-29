fun main() {
    val mas1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var a = mas1[0]
    mas1[0] = mas1[1]
    mas1[1] = a
    println(mas1.joinToString())
}
