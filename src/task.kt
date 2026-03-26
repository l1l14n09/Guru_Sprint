fun main() {
    val secretPassword = "QwertY321"
    var userPassword: String
    do {
        print("Введите пароль: ")
        userPassword = readLine() ?: ""
        if (userPassword != secretPassword) {
            println("Неверный пароль! Попробуйте снова.")
        }
    } while (userPassword != secretPassword)

    println("Доступ разрешен!")
}