fun maxmin(arr:Array<Int>){
    println("Максимальное: ${arr.max()} Минимальное: ${arr.min()}")
}
fun main(){
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(maxmin(arr))
}