fun main(){
    var mas1 = arrayOf(2, 1, 4, 4, 8)
    var mas2 = arrayOf(3, 7, 5, 10, 9)
    val j = mas1.plus(mas2)
    j.sort()
    println(j.joinToString())
}
