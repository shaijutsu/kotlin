fun raznost(mas: IntArray){
    println("Разность максимального и минимального из списка: ${mas.max() - mas.min()}")
}
fun main(){
    print("Введите размер списка: ")
    val size = readLine()!!.toInt()
    val mas = IntArray(size)
    for (i in 0 until size) {
        print("Введите $i элемент списка: ")
        mas[i] = readLine()!!.toInt()
    }
    raznost(mas)
}