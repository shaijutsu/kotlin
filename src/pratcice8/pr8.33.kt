fun find(n:Int, arr:Array<Int>):Int{
    return arr[n]
}
fun main(){
    val arr = arrayOf(1, 2, 3, 4, 5)
    println("Укажите индекс элемента: ")
    val n = readln().toInt()
    println(find(n,arr))
}