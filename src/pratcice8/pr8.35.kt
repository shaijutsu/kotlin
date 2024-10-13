fun SUMM(n: Int){
    var sum = 0
    for (i in 1..n)
        sum += i
    println(sum)
}
fun main(){
    println("Введите n: ")
    val n = readln().toInt()
    SUMM(n)
}