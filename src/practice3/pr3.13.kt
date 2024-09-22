fun main(){
    println("enter num ")
    val n = readln().toInt()
    val x = n / 1000
    val y = n / 100 % 10
    val z = n % 100 / 10
    val c = n % 100 % 10
    println("enter num a ")
    var a = readln().toInt()
    if(x + y == z + c) println("сумма первых двух цифр равна сумме последних двух цифр")
    if ((x + y + z + c) % 3 == 0) println("сумма цифр кратна 3")
    if ((x * y * z * c) % 4 == 0) println("произведение цифр кратно 4")
    if ((x * y * z * c) % a == 0) println("произведение цифр кратно $a")
}