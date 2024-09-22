fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    if (a % b == 0) print("числа кратные")
    else print("остаток от деления = ${a % b}")
}