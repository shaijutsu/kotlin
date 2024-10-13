fun count(str:String):Int {
    var count:Int = 0
    for (a in str) count++
    return count
}
fun main(){
    println("Введите строку: ")
    var str = readln()
    println("Количество символов в строке: " + count(str))
}