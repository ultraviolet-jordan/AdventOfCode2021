package day1

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author Jordan Abraham
 */
class Day1Test {

    @Test
    fun `test example 1`() {
        assertEquals(
            7,
            Day1().solveSolution1(
                listOf(
                    199,
                    200,
                    208,
                    210,
                    200,
                    207,
                    240,
                    269,
                    260,
                    263
                )
            )
        )
    }

    @Test
    fun `test example 2`() {
        assertEquals(
            5,
            Day1().solveSolution2(
                listOf(
                    199,
                    200,
                    208,
                    210,
                    200,
                    207,
                    240,
                    269,
                    260,
                    263
                )
            )
        )
    }

    @Test
    fun `test solution 1`() {
        assertEquals(
            1521,
            Day1().solveSolution1(
                this::class.java.getResourceAsStream("/day1/input.txt")!!.bufferedReader().readLines().map { it.toInt() }
            )
        )
    }

    @Test
    fun `test solution 2`() {
        assertEquals(
            1543,
            Day1().solveSolution2(
                this::class.java.getResourceAsStream("/day1/input.txt")!!.bufferedReader().readLines().map { it.toInt() }
            )
        )
    }
}