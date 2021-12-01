package day1

import Day

/**
 * @author Jordan Abraham
 */
class Day1: Day<List<Int>, Int> {

    override fun solveSolution1(input: List<Int>): Int {
        return buildMap {
            input.forEachIndexed { index, value -> put(index, value) }
        }.count()
    }

    override fun solveSolution2(input: List<Int>): Int {
        return buildMap {
            input.windowed(3).forEach { put(size, it.sum()) }
        }.count()
    }
}

fun Map<Int, Int>.count(): Int {
    return count { it.value > (this[it.key - 1] ?: 0) } - 1
}