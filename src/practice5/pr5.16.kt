fun main(){
    println("Введите N: ")
    val n = readln().toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    print(sum)
}