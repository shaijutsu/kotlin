fun main() {
    val mas = IntArray(100) { (0..100).random() }
    for (i in 0..90 step 10) {
        for (j in 0 until 10) {
            print("${mas[i + j]}\t")
        }
        println()
    }
}