fun main(){
    val a = readln().toInt();
    val b = readln().toInt();
    val c = readln().toInt()
    if((a == b) or (b == c) or (a == c)) print("error")
    else if ((a > b && a < c) or (a < b && a > c)) println(a)
    else if ((b > a && b < c) or (b < a && b > c)) println(b)
    else println(c)
}
