import kotlin.random.Random
fun main(){
    var mas = Array<Int>(20, { Random.nextInt(1, 100)})
    println(mas.joinToString())
}