fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    var temp = 0
    while (b != 0) {
        temp = b
        b = a % b
        a = temp
    }
    print(a)
}