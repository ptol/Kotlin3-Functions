package ru.otus.homework

fun main() {
    val a = 5
    val result = funWithLambda(10) {
        return
    }
    println(result)
}

inline fun funWithLambda(value: Int, action: (Int) -> Int) {
    println("Passed value: $value")
    resultProcessor { action(value) }
}

fun resultProcessor(block: () -> Int) {
    println("Result: ${block()}")
}
