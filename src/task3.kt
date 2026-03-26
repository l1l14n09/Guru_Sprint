fun main() {
    println("Способ 1: С проверкой условия")
    for (number in 1..10) {
        if (number % 2 == 0) {
            println(number)
        }
    }

    println("\nСпособ 2: С использованием step 2")
    for (number in 2..10 step 2) {
        println(number)
    }
}