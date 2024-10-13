fun proverka(a: Double, b: Double): Boolean{
    if ((a + b) < 100) return true
    else return false
}
fun main(){
    println("Укажите a: ")
    var a = readln().toDouble()
    println("Укажите b: ")
    var b = readln().toDouble()
    println(proverka(a,b))
}