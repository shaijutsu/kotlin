fun main() {
    val a = true
    val b = false
    val c = false
    println(a or !(a and b) or c) //a
    println(!a or a and (b or c)) //б
    println((a or b and !c) and c) //в
}