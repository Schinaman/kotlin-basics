package br.com.kotlin.basics.session04._0406


fun main() {

    val pizzasOrdered = 7

    when (pizzasOrdered) { // Substitui o Switch
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    when { // funciona como substituto do if else; não tem Argumentos
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }
}