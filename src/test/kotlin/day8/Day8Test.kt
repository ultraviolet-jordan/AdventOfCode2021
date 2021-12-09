package day8

import listOf
import logger
import java.lang.System.Logger.Level.INFO
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.measureTime

/**
 * @author Jordan Abraham
 */
class Day8Test {

    @Test
    fun `test example 1`() {
        val time = measureTime {
            assertEquals(
                66,
                Day8.part1(listOf("/day8/example.txt"))
            )
        }
        logger<Day8Test>().log(INFO, time)
    }

    @Test
    fun `test solution 1`() {
        val time = measureTime {
            assertEquals(
                349,
                Day8.part1(listOf("/day8/input.txt"))
            )
        }
        logger<Day8Test>().log(INFO, time)
    }
}