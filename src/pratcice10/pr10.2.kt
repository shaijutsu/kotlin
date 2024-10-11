fun generatePyramid(n: Int) {
    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val hashes = "#".repeat(2 * i - 1)
        val level = "$spaces$hashes$spaces"
        println(level)
    }
}
fun main() {
    println("Введите высоту пирамиды: ")
    val n = readln().toInt()
    generatePyramid(n)
}