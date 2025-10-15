package ru.otus.homework.homework

fun main() {
    val time = measureTime()
    println("Measured time: $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(): Long {
    TODO("Implement `measureTime`")
}