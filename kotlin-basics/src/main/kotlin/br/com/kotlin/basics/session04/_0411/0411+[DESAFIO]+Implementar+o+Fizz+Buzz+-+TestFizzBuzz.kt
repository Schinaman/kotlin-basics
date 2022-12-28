package br.com.kotlin.basics.session04._0411

import org.testng.annotations.Test

fun main(){
    fizzBuzz(15)
}

private fun fizzBuzz(n: Int): List<String> {

    val myArray = mutableListOf<String>()

    for (item in 2..n) {
        item.toString()
        when {
            (item%5 == 0 && item%3 == 0) -> myArray.add("FizzBuzz")
            item%3 == 0 -> myArray.add("Fizz")
            item%5 == 0 -> myArray.add("Buzz")
            else -> myArray.add(item.toString())
        }


    }
    println(myArray)
    return myArray
}




/*

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}*/
