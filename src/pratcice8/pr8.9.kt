import kotlin.math.pow
fun func(k: Double, n: Double): Boolean{
    if (k.pow(k) == n) return true
    else return false
}
fun main(){
    println("Укажите k: ")
    val k = readln().toDouble()
    println("Укажите n: ")
    val n = readln().toDouble()
    println(func(k,n))
}
