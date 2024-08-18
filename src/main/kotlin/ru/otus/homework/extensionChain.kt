package ru.otus.homework

fun main() {
    println(SomeValue(1).decrement().increment().decrement().increment().increment().abs())
}

data class SomeValue(val value: Int = 0)

fun SomeValue.increment(): SomeValue = copy(value = value + 1)
fun SomeValue.decrement(): SomeValue = copy(value = value - 1)
fun SomeValue.abs(): SomeValue = copy(value = kotlin.math.abs(value))
