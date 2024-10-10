fun main(){
    println("Курс рубля к доллару")
    println("Укажите сумму в рублях: ")
    val rub = readln().toDouble()
    println("$rub рублей в долларах ${rub*0.0103}")
}