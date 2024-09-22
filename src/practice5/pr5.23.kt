fun main() {
    while (true) {
        println("Введите 'стоп', чтобы завершить.")
        print("Введите первое число: ")
        val input1 = readLine()
        if (input1 == "стоп") break
        print("Введите второе число: ")
        val input2 = readLine()
        if (input2 == "стоп") break
        val num1 = input1?.toDoubleOrNull()
        val num2 = input2?.toDoubleOrNull()
        if (num1 == null || num2 == null) {
            println("введите корректные числа.")
            continue
        }
        println("Выберите операцию:\n1. Сложение\n2. Умножение")
        val choice = readLine()
        when (choice) {
            "1" -> {
                val sum = num1 + num2
                println("Результат сложения: $sum")
            }
            "2" -> {
                val umnoj = num1 * num2
                println("Результат умножения: $umnoj")
            }
            else -> {
                println("Выберите 1 или 2.")
            }
        }
    }
    println("Программа завершена.")
}