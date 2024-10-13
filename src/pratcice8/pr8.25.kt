fun summm(str1: String, str2:String){
    println(str1 + str2)
}
fun main(){
    print("Введите первую строку: ")
    val str1 = readln().toString()
    print("Введите вторую строку: ")
    val str2 = readln().toString()
    summm(str1, str2)
}