package day3

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day3Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                198,
                Day3.part1(listOf("/day3/example.txt"))
            )
        }
        logger<Day3Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                230,
                Day3.part2(listOf("/day3/example.txt"))
            )
        }
        logger<Day3Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                3309596,
                Day3.part1(listOf("/day3/input.txt"))
            )
        }
        logger<Day3Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                2981085,
                Day3.part2(listOf("/day3/input.txt"))
            )
        }
        logger<Day3Test>().log(INFO, time)
    }
}
