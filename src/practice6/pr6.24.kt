fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println("Исходная матрица:"); printMatr(matrix)
    val transposedMatrix = transpos(matrix)
    println("Транспонированная матрица:"); printMatr(transposedMatrix)
}
fun transpos(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rowCount = matrix.size
    val colCount = matrix[0].size
    val transposed = Array(colCount) { Array(rowCount) { 0 } }
    for (i in 0 until rowCount) {
        for (j in 0 until colCount) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}
fun printMatr(matrix: Array<Array<Int>>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}
