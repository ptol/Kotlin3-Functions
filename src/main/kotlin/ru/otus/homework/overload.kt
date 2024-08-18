package ru.otus.homework

fun main() {
    val b = Base()
    val c = Child()
    val d: Base = c

    val br: CharSequence = b.calculate(1, 2)
    val cr: String = c.calculate(1, 2)
    val dr: CharSequence = d.calculate(1, 2)

    println(br)
    println(cr)
    println(dr)
}

open class Base {
    open fun calculate(n1: Int, n2: Int): CharSequence {
        return "Base: $n1 + $n2 = ${n1 + n2}"
    }
}

class Child : Base() {
    override fun calculate(n1: Int, n2: Int): String {
        return "Child: $n1 + $n2 = ${n1 + n2}"
    }
}
