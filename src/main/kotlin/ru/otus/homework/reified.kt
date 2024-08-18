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

    val iv2: Int? = checkType(Box(1))
    val sv2: String? = checkType(Box("String"))
    println(iv2)
    println(sv2)
}

class Box<T>(val value: T)

fun <T> getValue(box: Box<T>): T {
    return box.value
}

inline fun <reified T> checkType(box: Box<*>): T? {
    return if(box.value is T) box.value else null
}
