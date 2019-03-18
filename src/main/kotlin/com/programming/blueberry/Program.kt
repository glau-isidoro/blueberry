package com.programming.blueberry

fun main(args: Array<String>) {
    println("Hello, World!")

    val fruit = Fruit("strawberry")
    println("I love ${fruit.name}")

    val candy = Candy("lollipop")
    println("I want a ${fruit.name} ${candy.name}")
}