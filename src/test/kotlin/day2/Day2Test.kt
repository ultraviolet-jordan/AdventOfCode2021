package day2

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day2Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                150,
                Day2.part1(
                    Submarine(splitOf(listOf("/day2/example.txt")))
                )
            )
        }
        logger<Day2Test>().log(INFO, time)
    }

    @Test
    fun `test example 2`() {
        val time = measureTime {
            assertEquals(
                900,
                Day2.part2(
                    Submarine(splitOf(listOf("/day2/example.txt")), true)
                )
            )
        }
        logger<Day2Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                1427868,
                Day2.part1(
                    Submarine(splitOf(listOf("/day2/input.txt")))
                )
            )
        }
        logger<Day2Test>().log(INFO, time)
    }

    @Test
    fun `test solution 2`() {
        val time = measureTime {
            assertEquals(
                1568138742,
                Day2.part2(
                    Submarine(splitOf(listOf("/day2/input.txt")), true)
                )
            )
        }
        logger<Day2Test>().log(INFO, time)
    }

    private fun splitOf(list: List<String>): List<List<String>> = list.map { it.split(" ") }
}
