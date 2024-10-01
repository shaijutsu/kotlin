fun main(){
    println("Введите строку: ")
    val stroka = readln().toString()
    val a = stroka.reversed()
    println(a)
    if (stroka == a) println("является полиндромом")
    else println("не является полиндромом")
}