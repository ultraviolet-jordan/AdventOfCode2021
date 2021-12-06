package day6

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
class Day6Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                5934,
                Day6.part1(listOf("/day6/example.txt"))
            )
        }
        logger<Day6Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                26984457539,
                Day6.part2(listOf("/day6/example.txt"))
            )
        }
        logger<Day6Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                379114,
                Day6.part1(listOf("/day6/input.txt"))
            )
        }
        logger<Day6Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                1702631502303,
                Day6.part2(listOf("/day6/input.txt"))
            )
        }
        logger<Day6Test>().log(INFO, timeOf(time))
    }
}