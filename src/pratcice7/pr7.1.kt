fun main(){
    println("Введите первое число: ")
    val num1 = readln()!!.toDoubleOrNull()
    println("Введите второе число: ")
    val num2 = readln()!!.toDoubleOrNull()
    println("Выберите операцию: (+, -, /, *)")
    val oper = readln()
    when (oper){
        "+" -> println("Результат: ${num1!! + num2!!}")
        "-" -> println("Результат: ${num1!! - num2!!}")
        "/" -> println("Результат: ${num1!! / num2!!}")
        "*" -> println("Результат: ${num1!! * num2!!}")
    }
}