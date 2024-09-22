fun main(){
    val km = readln().toDouble()
    val ft = readln().toDouble()
    if(km < (ft * 0.000305)) println("$km - меньше")
    else if((ft * 0.000305) < km) println("$ft - меньше")
}

