fun summa(mas: IntArray){
    println("Сумма элементов списка: ${mas.sum()}")
}
fun main(){
    print("Введите размер списка: ")
    val size = readLine()!!.toInt()
    val mas = IntArray(size)
    for (i in 0 until size) {
        print("Введите $i элемент списка: ")
        mas[i] = readLine()!!.toInt()
    }
    summa(mas)
}