package net.antiquera.fizzbuzz

class FizzBuzzGame {
    fun calculate(number: Int): String {
        var result = ""

        if (number % 3 == 0) {
            result += "Fizz"
        }

        if (number % 5 == 0) {
            result += "Buzz"
        }

        if (result != "") {
            return result
        }

        return number.toString()
    }
}