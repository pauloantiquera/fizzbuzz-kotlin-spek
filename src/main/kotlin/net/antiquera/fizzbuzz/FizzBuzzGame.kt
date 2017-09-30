package net.antiquera.fizzbuzz

class FizzBuzzGame {
     fun calculate(number: Int): String {
         var result = ""

         result += defineResutoForDivisibleBy3Number(number)
         result += defineResultForDivisibleBy5Number(number)

         result = defineResultForNeitherDivisibleBy3Nor5(number, result)

         return result
    }

    private fun defineResultForNeitherDivisibleBy3Nor5(number: Int, result: String) : String {
        if (result != "") {
            return result
        }

        return number.toString()
    }

    private fun defineResutoForDivisibleBy3Number(number: Int): String {
        if (isDivisibleBy3(number)) {
            return "Fizz"
        }

        return ""
    }

    private fun defineResultForDivisibleBy5Number(number: Int): String {
        if (isDivisibleBy5(number)) {
            return "Buzz"
        }

        return ""
    }

    private fun isDivisibleBy3(number: Int) = number % 3 == 0

    private fun isDivisibleBy5(number: Int) = number % 5 == 0


}