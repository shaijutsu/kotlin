import kotlin.math.max
fun srav(a: Int, b: Int): Int{
    return max(a,b)
}
fun main(){
    println("Введите a: ")
    val a = readln().toInt()
    println("Введите b: ")
    val b = readln().toInt()
    println(srav(a,b))
}