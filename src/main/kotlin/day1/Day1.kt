package day1

import Day

/**
 * @author Jordan Abraham
 */
class Day1: Day<List<Int>, Int> {

    override fun solveSolution1(input: List<Int>): Int = input.mapIndexed { index, value -> index to value }
        .toMap()
        .count()

    override fun solveSolution2(input: List<Int>): Int = input.windowed(3)
        .mapIndexed { index, list -> index to list }
        .associateBy({it.first}, {it.second.sum()})
        .toMap()
        .count()
}

fun Map<Int, Int>.count(): Int = count { it.value > (this[it.key - 1] ?: 0) } - 1