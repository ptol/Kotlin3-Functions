package ru.otus.homework.homework

fun main() {
    check("str1 str2 str3" == concatStrings("str1", "str2", "str3"))
}

fun concatStrings(vararg strings: String): String {
    TODO("Implement `concatStrings`")
}