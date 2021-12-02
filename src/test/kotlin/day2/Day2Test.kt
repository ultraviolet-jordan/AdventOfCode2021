package day2

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
class Day2Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                150,
                Day2().solvePart1(listOf("/day2/example.txt"))
            )
        }
        logger<Day2Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                900,
                Day2().solvePart2(listOf("/day2/example.txt"))
            )
        }
        logger<Day2Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                1427868,
                Day2().solvePart1(listOf("/day2/input.txt"))
            )
        }
        logger<Day2Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                1568138742,
                Day2().solvePart2(listOf("/day2/input.txt"))
            )
        }
        logger<Day2Test>().log(INFO, timeOf(time))
    }
}