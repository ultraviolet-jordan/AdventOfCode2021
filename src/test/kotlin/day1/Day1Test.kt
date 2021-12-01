package day1

import intListOf
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
            Day1().solveSolution1(intListOf<Day1>("/day1/example.txt"))
        )
    }

    @Test
    fun `test example 2`() {
        assertEquals(
            5,
            Day1().solveSolution2(intListOf<Day1>("/day1/example.txt"))
        )
    }

    @Test
    fun `test solution 1`() {
        assertEquals(
            1521,
            Day1().solveSolution1(intListOf<Day1>("/day1/input.txt"))
        )
    }

    @Test
    fun `test solution 2`() {
        assertEquals(
            1543,
            Day1().solveSolution2(intListOf<Day1>("/day1/input.txt"))
        )
    }
}