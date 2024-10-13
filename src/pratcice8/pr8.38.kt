fun length(str: String): Int{
    return str.indices.last + 1
}
fun main(){
    println("Введите строку: ")
    val str = readln()
    println(length(str))
}