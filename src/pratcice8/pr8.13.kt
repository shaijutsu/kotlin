fun summm(a: Int, b: Int): Int{
    return a + b
}
fun main(){
    println("Введите a: ")
    val a = readln().toInt()
    println("Введите b: ")
    val b = readln().toInt()
    println(summm(a,b))
}