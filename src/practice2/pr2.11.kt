fun main() {
    val x = false
    val y = false
    val z = true
    println(x or y and !z) //a
    println(!x and !y) //б
    println(!(x and z) or y) //в
    println(x and !y or z) //г
    println(x and (!y or z)) //д
    println(x or (!(y or z))) //е
}