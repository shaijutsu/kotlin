fun proverkaaa(a: Int): Boolean{
    if (a % 100 == 0) return true
    else return false
}
fun main(){
    println("Укажите число: ")
    var a = readln().toInt()
    println(proverkaaa(a))
}