fun probel(str: String): String{
    return str.replace(" ", "")
}
fun main(){
    println("Введите строку: ")
    var str = readln()
    println(probel(str))
}