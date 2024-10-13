fun stroka(str1:String, str2:String):Boolean{
    return if (str2 in str1) true
    else false
}
fun main(){
    println("Введите строку 1: ")
    val str1 = readln()
    println("Введите строку 2:")
    val str2 = readln()
    println(stroka(str1, str2))
}