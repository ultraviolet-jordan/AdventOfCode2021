package day7

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day7Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                37,
                Day7.part1(listOf("/day7/example.txt"))
            )
        }
        logger<Day7Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                168,
                Day7.part2(listOf("/day7/example.txt"))
            )
        }
        logger<Day7Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                351901,
                Day7.part1(listOf("/day7/input.txt"))
            )
        }
        logger<Day7Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                101079875,
                Day7.part2(listOf("/day7/input.txt"))
            )
        }
        logger<Day7Test>().log(INFO, time)
    }
}
