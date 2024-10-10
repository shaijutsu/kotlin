fun anagram(a: String, b: String): Boolean {
    val str1 = a.replace("\\s+".toRegex(), "").lowercase()
    val str2 = b.replace("\\s+".toRegex(), "").lowercase()
    return str1.toCharArray().sortedArray().contentEquals(str2.toCharArray().sortedArray())
}
fun main() {
    val a = readln()
    val b = readln()
    if (anagram(a, b)) {
        println("являются анаграммами")
    } else {
        println("не являются анаграммами")
    }
}