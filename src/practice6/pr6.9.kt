fun main(){
    val mas1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mas2 = mutableListOf<Int>()
    for (i in mas1){
        mas2.add(i)
    }
    println(mas1.joinToString())
    print(mas2.joinToString())
}
