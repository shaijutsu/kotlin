fun main() {
    val numbers = arrayOf(11, 22, 12, 33, 44, 13, 32, 42, 11, 24)
    println("Исходный массив: ${numbers.joinToString(" ")}")
    bubbleSort(numbers)
    println("Отсортированный массив: ${numbers.joinToString(" ")}")
}
fun bubbleSort(arr: Array<Int>) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}