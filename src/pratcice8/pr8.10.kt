fun printa(txt: String, n: Int){
    for (i in 1..n){
        print(txt)
    }
}
fun main(){
    println("Введите строку: ")
    val txt = readln().toString()
    println("Введите n: ")
    val n = readln().toInt()
    printa(txt,n)
}