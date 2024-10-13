fun arr(size: Int,mas: IntArray){
    for (i in 0 until size) {
        mas[i] = i+1
    }
    println(mas.joinToString())
}
fun main(){
    print("Введите n размер массива: ")
    val size = readLine()!!.toInt()
    val mas = IntArray(size)
    arr(size,mas)
}
