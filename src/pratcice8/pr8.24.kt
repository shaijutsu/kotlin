fun up(str: String): String {
    return str.toUpperCase()
}
fun main(){
    println("Введите строку: ")
    val str = readln().toString()
    println(up(str))
}