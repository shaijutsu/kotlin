import java.time.LocalDate
import java.time.Month
fun main() {
    println("Введите год:")
    val year = readln().toInt()
    println("Введите месяц (от 1 до 12):")
    val monthNumber = readln().toInt()
    val month = Month.of(monthNumber)
    val daysInMonth = month.length(LocalDate.of(year, month, 1).isLeapYear)
    println("Все даты в месяце $monthNumber года $year:")
    for (day in 1..daysInMonth) {
        val date = LocalDate.of(year, month, day)
        println(date)
    }
}
