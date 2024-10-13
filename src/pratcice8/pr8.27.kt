fun proverkaaaa(arr:Array<Int>, a:Int):Boolean{
    return if(a in arr) true
    else false
}
fun main(){
    val arr = arrayOf(1, 2, 3, 4, 5)
    var a = readln().toInt()
    println(proverkaaaa(arr, a))
}