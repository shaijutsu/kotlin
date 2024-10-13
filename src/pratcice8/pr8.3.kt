fun summ(mas1: IntArray, mas2: IntArray){
    println((mas1 + mas2).joinToString())
}
fun main(){
    print("Введите размер первого списка: ")
    val size1 = readLine()!!.toInt()
    val mas1 = IntArray(size1)
    for (i in 0 until size1) {
        print("Введите $i элемент списка: ")
        mas1[i] = readLine()!!.toInt()
    }
    print("Введите размер второго списка: ")
    val size2 = readLine()!!.toInt()
    val mas2 = IntArray(size2)
    for (i in 0 until size2) {
        print("Введите $i элемент списка: ")
        mas2[i] = readLine()!!.toInt()
    }
    summ(mas1,mas2)
}