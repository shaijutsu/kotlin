fun main(){
    println("Введите N: ")
    val n = readln().toInt()
    var chet = 0
    var nechet = 0
    for (a in 1..n){
        if (a % 2 == 0) chet += a
        else nechet += a
    }
    println("Сумма четных = $chet\nСумма нечетных = $nechet")
}