import kotlin.random.Random
data class Card(val rank: String, val value: Int)
class Deck {
    private val cards = List(52) { index ->
        val rank = when (index % 13) {
            0 -> "A"
            in 1..9 -> (index % 13).toString()
            else -> "JQK"[index % 13 - 10].toString()
        }
        Card(rank, if (rank == "A") 11 else if (rank in "JQK") 10 else rank.toInt())
    }.shuffled().toMutableList()

    fun draw(): Card = cards.removeAt(cards.size - 1)
}
class Player(val name: String) {
    private val hand = mutableListOf<Card>()
    fun addCard(card: Card) {
        hand.add(card)
    }
    fun score(): Int {
        var total = hand.sumOf { it.value }
        hand.count { it.rank == "A" }.let { aces ->
            total -= if (total > 21) aces * 10 else 0
        }
        return total
    }
    fun showHand(hidden: Boolean = false): String {
        return if (hidden) "???" else hand.joinToString(", ") { it.rank }
    }
}
fun main() {
    val deck = Deck()
    val player = Player("Игрок")
    val dealer = Player("Дилер")
    repeat(2) {
        player.addCard(deck.draw())
        dealer.addCard(deck.draw())
    }
    while (true) {
        println("Ваша рука: ${player.showHand()} (Счёт: ${player.score()})")

        if (player.score() == 21) {
            println("Вы выиграли!")
            return
        } else if (player.score() > 21) {
            println("Вы проиграли! Перебор.")
            return
        }

        println("Хотите взять карту? (y/n)")
        if (readLine()?.lowercase() != "y") {
            break
        }
        player.addCard(deck.draw())
    }
    while (dealer.score() < 17) {
        dealer.addCard(deck.draw())
    }
    println("\nРука дилера: ${dealer.showHand()} (Счёт: ${dealer.score()})")
    println("Ваша рука: ${player.showHand()} (Счёт: ${player.score()})")
    when {
        dealer.score() > 21 -> println("Дилер перебрал! Вы выиграли!")
        player.score() > dealer.score() -> println("Вы выиграли!")
        player.score() < dealer.score() -> println("Вы проиграли!")
        else -> println("Ничья!")
    }
}