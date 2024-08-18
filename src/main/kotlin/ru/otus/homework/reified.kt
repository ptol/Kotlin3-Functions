package ru.otus.homework

const val someString: String = "A string"

fun someFun(value: Int): String {
    return value.toString()
}

fun main() {
    println(someString)
    println(someFun(10))

    val iv: Int = getValue(Box(1))
    val sv: String = getValue(Box("String"))
    println(iv)
    println(sv)
}

class Box<T>(val value: T)

fun <T> getValue(box: Box<T>): T {
    return box.value
}
