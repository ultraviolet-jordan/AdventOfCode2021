package day1

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author Jordan Abraham
 */
class Day1Test {

    @Test
    fun `test solution 1`() {
        with(this::class.java.getResourceAsStream("/day1/input.txt")!!.bufferedReader().readLines()) {
            with(buildMap {
                forEachIndexed { index, string ->
                    put(index, string.toInt())
                }
            }) {
                assertEquals(
                    count { it.value > (this[it.key - 1] ?: 0) } - 1,
                    1521
                )
            }
        }
    }

    @Test
    fun `test solution 2`() {
        val lines = this::class.java.getResourceAsStream("/day1/input.txt")!!.bufferedReader().readLines()
        with(buildMap {
            lines.windowed(3).forEach {
                put(size, it.sumOf { v -> v.toInt() })
            }
        }) {
            assertEquals(
                count { it.value > (this[it.key - 1] ?: 0) } - 1,
                1543
            )
        }
    }
}