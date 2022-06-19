package br.com.muriloabranches.section04

fun fizzBuzz(n: Int): List<String> {

    val list = mutableListOf<String>()

    for (number in 1 .. n) {
        when {
            (number % 3) == 0 && (number % 5) == 0 -> list.add("FizzBuzz")
            (number % 3) == 0 -> list.add("Fizz")
            (number % 5) == 0 -> list.add("Buzz")
            else -> list.add(number.toString())
        }
    }

    /* Solution
    for (it in 1 .. n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }

        list.add(item)
    }
     */

    /* Solution with foreach
    (1 .. n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }

        list.add(item)
    }
     */

    return list
}