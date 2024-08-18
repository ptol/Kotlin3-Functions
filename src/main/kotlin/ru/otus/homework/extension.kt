package ru.otus.homework

import ru.otus.homework.SomeLibraryClass.Companion.plusExt2

fun main() {
    println(SomeLibraryClass().plusExt1())
    println(SomeLibraryClass().plusExt2())
}

class SomeLibraryClass {
    fun publicFun() = "Result of public fun"

    private fun privateFun() = "Result of private fun"

    companion object {
        fun SomeLibraryClass.plusExt2() = privateFun() + " + Ext2"
    }
}

fun SomeLibraryClass.plusExt1() = publicFun() + " + Ext1"

