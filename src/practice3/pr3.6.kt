fun main(){
    val year = readln().toInt()
    if((year % 4 == 0) and (year % 400 == 0)) print("$year - високосный \nКол-во дней = 366")
    else print("$year - не високосный")
}