package net.antiquera.fizzbuzz

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class FizzBuzzGameTest : Spek ({

    describe("FizzBuzz Game") {
        val game = FizzBuzzGame()

        on("provided number is neither divisible by 3 nor 5") {
            val result = game.defineResponseFor(8)

            it("should return '8'") {
                assertEquals("8", result)
            }
        }

        on("provided number is divisible by 3") {
            val result =  game.defineResponseFor(3)

            it("should return 'Fizz'") {
                assertEquals("Fizz", result)
            }
        }

        on("provided number is divisible by 5") {
            val result = game.defineResponseFor(5)

            it("should return 'Buzz'") {
                assertEquals("Buzz", result)
            }
        }

        on("provided number is divisible by both 3 and 5") {
            val result =  game.defineResponseFor(15)

            it("should return 'FizzBuzz'") {
                assertEquals("FizzBuzz", result)
            }
        }
    }
})