package ru.otus.homework

fun main() {
    val a = 5
    val result = funWithLambda(10) {
        return
    }
    println(result)
}

inline fun funWithLambda(value: Int, action: (Int) -> Int): Int {
    println("Passed value: $value")
    return action(value)
}
