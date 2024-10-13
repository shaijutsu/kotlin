fun revers(str: String): String {
    return str.reversed()
}
fun main(){
    println("Введит строку: ")
    val str = readln()
    println(revers(str))
}