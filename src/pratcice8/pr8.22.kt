fun pali(str: String): Boolean{
    if (str.reversed() == str) return true
    else return false
}
fun main(){
    println("Введите строку: ")
    val str = readln().toString()
    println(pali(str))
}