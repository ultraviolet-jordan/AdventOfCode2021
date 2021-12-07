package day4

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day4Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                4512,
                Day4.part1(listOf("/day4/example.txt"))
            )
        }
        logger<Day4Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                1924,
                Day4.part2(listOf("/day4/example.txt"))
            )
        }
        logger<Day4Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                65325,
                Day4.part1(listOf("/day4/input.txt"))
            )
        }
        logger<Day4Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                4624,
                Day4.part2(listOf("/day4/input.txt"))
            )
        }
        logger<Day4Test>().log(INFO, time)
    }
}
