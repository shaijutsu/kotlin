fun main() {
    val x = true
    val y = true
    val z = false
    println(!x and y) //a
    println(x or !y) //б
    println(x or y and z) //в
}