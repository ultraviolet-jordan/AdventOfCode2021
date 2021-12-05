package day5

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
class Day5Test {

    @Test
    fun `test example 1`() {
        val time = measureTimeMillis {
            assertEquals(
                5,
                Day5.part1(listOf("/day5/example.txt"))
            )
        }
        logger<Day5Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test example 2`() {
        val time = measureTimeMillis {
            assertEquals(
                12,
                Day5.part2(listOf("/day5/example.txt"))
            )
        }
        logger<Day5Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 1`() {
        val time = measureTimeMillis {
            assertEquals(
                7644,
                Day5.part1(listOf("/day5/input.txt"))
            )
        }
        logger<Day5Test>().log(INFO, timeOf(time))
    }

    @Test
    fun `test solution 2`() {
        val time = measureTimeMillis {
            assertEquals(
                18627,
                Day5.part2(listOf("/day5/input.txt"))
            )
        }
        logger<Day5Test>().log(INFO, timeOf(time))
    }
}