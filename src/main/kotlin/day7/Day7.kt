package day7

import Day
import listOfSplit
import kotlin.math.abs

/**
 * @author Jordan Abraham
 */
object Day7 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int = with(input.listOfSplit<Int>(",").sorted()) { sumOf { abs(this[this.size / 2] - it) } }
    override fun part2(input: List<String>): Int = with(input.listOfSplit<Int>(",").sorted()) {
        (0..maxOf { it }).minOf { cost -> sumOf { with(abs(cost - it)) { this * (this + 1) / 2 } } }
    }
}
