fun points(wins: Int, draws: Int, loss: Int): Int {
    return (wins * 3) + (draws * 1) + (loss * 0)
}
fun main() {
    println("Введите количество побед: ")
    val wins = readln().toInt();
    println("Введите количество ничьих: ")
    val draws = readln().toInt()
    println("Введите количество поражений: ")
    val loss = readln().toInt()
    val totalPoints = points(wins, draws, loss)
    println("Количество очков: $totalPoints")
}