package day1

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day1Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                7,
                Day1.part1(listOf("/day1/example.txt"))
            )
        }
        logger<Day1Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                5,
                Day1.part2(listOf("/day1/example.txt"))
            )
        }
        logger<Day1Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                1521,
                Day1.part1(listOf("/day1/input.txt"))
            )
        }
        logger<Day1Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                1543,
                Day1.part2(listOf("/day1/input.txt"))
            )
        }
        logger<Day1Test>().log(INFO, time)
    }
}
