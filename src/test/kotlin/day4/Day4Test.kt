package day4

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
class Day4Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                4512,
                Day4.part1(listOf("/day4/example.txt"))
            )
        }
        logger<Day4Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                1924,
                Day4.part2(listOf("/day4/example.txt"))
            )
        }
        logger<Day4Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                65325,
                Day4.part1(listOf("/day4/input.txt"))
            )
        }
        logger<Day4Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                4624,
                Day4.part2(listOf("/day4/input.txt"))
            )
        }
        logger<Day4Test>().log(INFO, timeOf(time))
    }

}