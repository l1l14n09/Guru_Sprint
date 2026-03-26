fun main() {
    for (number in 1..10) {
        if (number == 5) {
            println("Пропускаем число $number")
            continue
        }
        if (number == 8) {
            println("Достигнуто число $number")
            break
        }
        println(number)
    }
    println("Цикл прерван")
}