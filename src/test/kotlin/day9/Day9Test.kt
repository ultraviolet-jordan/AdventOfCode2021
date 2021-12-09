package day9

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day9Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                15,
                Day9.part1(listOf("/day9/example.txt"))
            )
        }
        logger<Day9Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                1134,
                Day9.part2(listOf("/day9/example.txt"))
            )
        }
        logger<Day9Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                518,
                Day9.part1(listOf("/day9/input.txt"))
            )
        }
        logger<Day9Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                949905,
                Day9.part2(listOf("/day9/input.txt"))
            )
        }
        logger<Day9Test>().log(INFO, time)
    }
}
