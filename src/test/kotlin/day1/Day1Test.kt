package day1

import listOf
import logger
import timeOf
import java.lang.System.Logger.Level.INFO
import kotlin.system.measureTimeMillis
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author Jordan Abraham
 */
class Day1Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                7,
                Day1.solvePart1(listOf("/day1/example.txt"))
            )
        }
        logger<Day1Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                5,
                Day1.solvePart2(listOf("/day1/example.txt"))
            )
        }
        logger<Day1Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                1521,
                Day1.solvePart1(listOf("/day1/input.txt"))
            )
        }
        logger<Day1Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                1543,
                Day1.solvePart2(listOf("/day1/input.txt"))
            )
        }
        logger<Day1Test>().log(INFO, timeOf(time))
    }
}