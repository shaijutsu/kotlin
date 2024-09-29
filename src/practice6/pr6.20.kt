fun main(){
    val count = 10
    val start = 1
    val step = 2
    val progr = IntArray(count)
    for (i in 0 until count) {
        progr[i] = start + i * step
    }
    println(progr.joinToString())
}