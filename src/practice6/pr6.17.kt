fun main(){
    val mas = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var pro = mas[0]
    for (a in 1 until mas.size){
        pro *= mas[a]
    }
    println("сумма: ${mas.sum()} произведение: $pro")
}
