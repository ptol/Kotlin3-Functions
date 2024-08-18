package ru.otus.homework

fun main() {
    val a = 5
    val result = funWithLambda(
        value = 10,
        action = { it * 10 },
        onError = { it.message ?: "UNKNOWN"}
    )
    println(result)
}

inline fun funWithLambda(value: Int, crossinline action: (Int) -> Int, onError: (Throwable) -> String) {
    println("Passed value: $value")
    try {
        resultProcessor { action(value) }
    } catch (e: Throwable) {
        errorProcessor(e, onError)
    }
}

fun errorProcessor(error: Throwable, block: (Throwable) -> String) {
    println("Error: ${block(error)}")
}

fun resultProcessor(block: () -> Int) {
    println("Result: ${block()}")
}
