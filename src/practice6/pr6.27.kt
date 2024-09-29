fun main() {
    val numbers = arrayOf(1, 3, 3, 3, 2, 2, 5, 5, 5, 5, 3, 3, 3)
    val (maxCount, element) = findMaxSequence(numbers)
    if (maxCount > 0) {
        println("Максимальная последовательность элемента $element длиной $maxCount.")
    } else {
        println("Массив пустой.")
    }
}
fun findMaxSequence(array: Array<Int>): Pair<Int, Int> {
    if (array.isEmpty()) return Pair(0, 0)
    var maxCount = 1
    var currentCount = 1
    var maxElement = array[0]
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentCount++
            if (currentCount > maxCount) {
                maxCount = currentCount
                maxElement = array[i]
            }
        } else {
            currentCount = 1
        }
    }
    return Pair(maxCount, maxElement)
}