fun prime(a: Int): Boolean {
    for (i in 2..a / 2){
        if (a % i == 0) return false
    }
    return true
}
fun main(){
    print("Введите число: ")
    val a = readln().toInt()
    println(prime(a))
}