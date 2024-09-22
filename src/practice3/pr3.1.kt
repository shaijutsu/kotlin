import kotlin.math.max
fun main(){
    val a = readln().toInt()
    val c = readln().toInt()
    val b = readln().toInt()
    var max = max(a, b)
    max = max(max, c)
    println("$max max")
}