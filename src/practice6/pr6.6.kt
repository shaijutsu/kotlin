fun main(){
    val mas = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chet = mutableListOf<Int>()
    val nechet = mutableListOf<Int>()
    for (i in mas) {
        if (i % 2 == 0) {
            chet.add(i)
        } else {
            nechet.add(i)
        }
    }
    println("chet: $chet nechet: $nechet")
}