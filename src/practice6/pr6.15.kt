fun main() {
    val mas = arrayOf(1, 2, 3, 2, 1)
    val isPalindrome = run {
        var palindrome = true
        for (i in 0 until mas.size / 2) {
            if (mas[i] != mas[mas.size - 1 - i]) {
                palindrome = false
                break
            }
        }
        palindrome
    }
    if (isPalindrome) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}
