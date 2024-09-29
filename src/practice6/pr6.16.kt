fun main(){
    var mas1 = arrayOf(1, 2, 3, 4, 5)
    var mas2 = arrayOf(6, 7, 8, 9, 10)
    val j = mas1.plus(mas2)
    println(j.joinToString())
}