fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 1
    var fib = 0
    for (i in 2..n) {
        fib = a + b
        a = b
        b = fib
    }
    print(fib)
}