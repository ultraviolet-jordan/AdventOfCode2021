package day6

import Day
import splitToList

/**
 * @author Jordan Abraham
 */
object Day6 : Day<List<String>, Long> {

    override fun part1(input: List<String>): Long = input.toFish().cycleDays(80).values.sum()
    override fun part2(input: List<String>): Long = input.toFish().cycleDays(256).values.sum()

    private fun List<String>.toFish() = buildMap<Int, Long> { first().splitToList<Int>(",").forEach { put(it, ((this[it] ?: 0) + 1)) } }.toMutableMap()

    private fun MutableMap<Int, Long>.cycleDays(days: Int): MutableMap<Int, Long> {
        repeat(days) {
            val first = this[0] ?: 0
            repeat(8) { this[it] = this[it + 1] ?: 0 }
            this[6] = (this[6] ?: 0) + first
            this[8] = first
        }
        return this
    }
}
