fun truefalse(num1: Int, num2: Int): Boolean{
    if (num1 == num2) return true
    else return false
}
fun main(){
    println("Введите первое число: ")
    val num1 = readln().toInt()
    println("Введите второе число: ")
    val num2 = readln().toInt()
    println(truefalse(num1, num2))
}