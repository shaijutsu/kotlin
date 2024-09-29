fun main(){
    var mas1 = arrayOf(2, 1, 4, 4, 8)
    var mas2 = arrayOf(3, 7, 5, 10, 9)
    var mas3 = arrayOf(11, 5, 6, 2, 12)
    var j = mas1.plus(mas2)
    var r = j.plus(mas3)
    println(r.joinToString())
}
