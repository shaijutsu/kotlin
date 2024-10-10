import kotlin.random.Random
fun main() {
    val random = Random.nextInt(1, 101)
    var attempts = 0
    var guessed = false
    println("Угадайте число от 1 до 100!")
    while (!guessed) {
        println("Введите число: ")
        val guessedNumber = readLine()!!.toInt()
        when {
            guessedNumber < random -> {
                println("Загаданное число больше.")
            }
            guessedNumber > random -> {
                println("Загаданное число меньше.")
            }
            else -> {
                guessed = true
                println("Вы угадали число $random!")
            }
        }
    }
}