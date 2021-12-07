package day6

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day6Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                5934,
                Day6.part1(listOf("/day6/example.txt"))
            )
        }
        logger<Day6Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                26984457539,
                Day6.part2(listOf("/day6/example.txt"))
            )
        }
        logger<Day6Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                379114,
                Day6.part1(listOf("/day6/input.txt"))
            )
        }
        logger<Day6Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                1702631502303,
                Day6.part2(listOf("/day6/input.txt"))
            )
        }
        logger<Day6Test>().log(INFO, time)
    }
}
