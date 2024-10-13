fun tablica(n: Int){
    for (i in 1..10){
        print("${i * n}\t")
    }
}
fun main(){
    println("Введите n: ")
    val n = readln().toInt()
    tablica(n)
}