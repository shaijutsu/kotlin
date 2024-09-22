import kotlin.random.Random
fun main() {
    val random = Random.nextInt(1, 100)
    println("Угадайте число от 1 до 100: ")
    val guess = readLine()?.toIntOrNull()
    if (guess == random) {
        println("Вы угадали число $random.")
    } else {
        println("Загаданное число было $random.")
    }
}