fun maxi(mas: IntArray){
    println("Максимальное: ${mas.max()}")
}
fun main(){
    print("Введите размер массива: ")
    val size = readLine()!!.toInt()
    val mas = IntArray(size)
    for (i in 0 until size) {
        print("Введите $i элемент массива: ")
        mas[i] = readLine()!!.toInt()
    }
    maxi(mas)
}