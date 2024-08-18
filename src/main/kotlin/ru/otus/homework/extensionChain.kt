package ru.otus.homework

fun main() {
    println(abs(increment(increment(decrement(increment(decrement(SomeValue(1))))))))
}

data class SomeValue(val value: Int = 0)

fun increment(someValue: SomeValue): SomeValue = someValue.copy(value = someValue.value + 1)
fun decrement(someValue: SomeValue): SomeValue = someValue.copy(value = someValue.value - 1)
fun abs(someValue: SomeValue): SomeValue = someValue.copy(value = kotlin.math.abs(someValue.value))
