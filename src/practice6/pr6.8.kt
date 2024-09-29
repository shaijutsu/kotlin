fun main() {
    val mas = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print("Введите элемент который хотите найти: ")
    val target = readLine()!!.toInt()
    val index = mas.indexOf(target)
    if (index != -1) {
        println("Элемент $target найден на $index месте")
    } else {
        println("Элемент $target не найден в массиве")
    }
}