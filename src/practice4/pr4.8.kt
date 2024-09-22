fun timeToCook(food:String): String{
    return when{
        food == "Картофель" -> "25 мин"
        food == "Рис" -> "10 мин"
        food == "Курица" -> "60 мин"
        food == "Говядина" -> "50 мин"
        food == "Свинина" -> "30 мин"
        food == "Щавель" -> "2 мин (пасхалко)"
        else -> "Неверно введено все!"
    }
}
fun main(){

    println("""
            1        2     3         4        5       6
        [Картофель, Рис, Курица, Говядина, Свинина, Щавель]
    """.trimIndent())
    print("\nВведите номер пищи, что вы будете готовить: ")
    var num:Int
    do {
        num = readln().toInt()
    }while (num > 6 || num < 1)
    val food:Array<String> = arrayOf("Картофель", "Рис", "Курица", "Говядина", "Свинина", "Щавель")
    println("\n\nВремя готовки для ${food[num-1]}: ${timeToCook(food[num-1])}")
}