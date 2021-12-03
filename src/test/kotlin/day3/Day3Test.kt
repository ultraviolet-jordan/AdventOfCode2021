package day3

import day1.Day1Test
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
class Day3Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                198,
                Day3.part1(listOf("/day3/example.txt"))
            )
        }
        logger<Day3Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                230,
                Day3.part2(listOf("/day3/example.txt"))
            )
        }
        logger<Day3Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                3309596,
                Day3.part1(listOf("/day3/input.txt"))
            )
        }
        logger<Day3Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                2981085,
                Day3.part2(listOf("/day3/input.txt"))
            )
        }
        logger<Day3Test>().log(INFO, timeOf(time))
    }
}