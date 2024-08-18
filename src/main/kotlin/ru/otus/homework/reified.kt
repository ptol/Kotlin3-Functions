package ru.otus.homework

const val someString: String = "A string"

fun someFun(value: Int): String {
    return value.toString()
}

fun main() {
    println(someString)
    println(someFun(10))
}
