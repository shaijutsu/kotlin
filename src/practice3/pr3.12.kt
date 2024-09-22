fun main(){
    val n = readln().toInt()
    val a = n / 10
    val b = n % 10
    if (a > b) print("первая больше")
    else if (b > a) print("вторая больше")
    else if (b == a) print("цифры одинаковы")
}
