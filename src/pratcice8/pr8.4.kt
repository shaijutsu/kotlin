fun proverka(prob: Double, prize: Double, pay: Double): Boolean{
    if ((prob * prize) > pay) return true
    else return false
}
fun main(){
    println("Укажите prob: ")
    var prob = readln().toDouble()
    println("Укажите prize: ")
    var prize = readln().toDouble()
    print("Укажите pay = ")
    var pay = readln().toDouble()
    println(proverka(prob, prize, pay))
}