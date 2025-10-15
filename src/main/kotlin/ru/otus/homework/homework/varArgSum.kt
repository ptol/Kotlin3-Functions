package ru.otus.homework.homework

fun main() {
    check(3 == varArgSum(1, 2))
    check(6 == varArgSum(1, 2, 3))
    check(10 == varArgSum(1, 2, 3, 4))
}

fun varArgSum(a1: Int, a2: Int, a3: Int): Int {
    TODO("Implement `varArgSum`")
}