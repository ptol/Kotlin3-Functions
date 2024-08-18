package ru.otus.homework

fun main() {
    println(outer(5))
}

fun outer(value: Int): Int {
    fun inner(): Int {
        return value + 1
    }
    return inner() + inner() + 2
}
