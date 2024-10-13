fun fps(min:Int, fps:Int): Int {
    return min * fps * 60
}
fun main(){
    print("Укажите минуты: ")
    var mins = readln().toInt()
    print("Укажите fps = ")
    var fps = readln().toInt()
    println(fps(mins, fps))
}