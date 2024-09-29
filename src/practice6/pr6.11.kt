fun main(){
    val mas1 = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mas2 = mutableListOf<Int>(2, 4, 6, 3, 7, 8, 9, 10, 12, 11)
    val p = mas1.intersect(mas2)
    println(p)
}