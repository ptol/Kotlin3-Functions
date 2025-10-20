package ru.otus.homework.homework


fun main() {
    val time = measureTime(::longRunningTask)
    println("Measured time: $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(fn: () -> Unit): Long {
    val start = System.currentTimeMillis()
    fn()
    val finish = System.currentTimeMillis()
    return finish - start
}