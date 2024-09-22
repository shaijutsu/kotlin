fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if ((a <= b + c) and (b <= a + c) and (c <= b + a)) print("yes")
    else println("no")
}
