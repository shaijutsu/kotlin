fun countdown(n: Int): List<Int> {
    return if (n <= 0) {
        emptyList()
    } else {
        (n downTo 1).toList()
    }
}
fun main(){
    println("Введите n: ")
    var n = readln().toInt()
    println(countdown(n))
}