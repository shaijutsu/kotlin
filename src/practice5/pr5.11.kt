fun main() {
    println("Введите первую строку:")
    val str1:String = readLine().toString()
    println("Введите вторую строку:")
    val str2:String = readLine().toString()
    if (areAnagrams(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}
fun areAnagrams(str1: String, str2: String): Boolean {
    return str1.toList().sorted() == str2.toList().sorted()
}