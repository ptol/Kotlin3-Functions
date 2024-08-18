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

    val iv2: Int? = checkType(Box(1), Int::class.java)
    val sv2: String? = checkType(Box("String"), String::class.java)
    println(iv2)
    println(sv2)
}

class Box<T>(val value: T)

fun <T> getValue(box: Box<T>): T {
    return box.value
}

@Suppress("UNCHECKED_CAST")
fun <T> checkType(box: Box<*>, t: Class<T>): T? {
    return if(t.isInstance(box.value)) (box.value as T) else null
}
