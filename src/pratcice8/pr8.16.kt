fun chet(a: Int): Boolean{
    if (a % 2 == 0) return true
    else return false
}
fun main(){
    println("Введите число: ")
    val a = readln().toInt()
    println(chet(a))
}