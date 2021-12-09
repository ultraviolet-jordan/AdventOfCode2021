package day8

import Day

/**
 * @author Jordan Abraham
 */
object Day8 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int = input.map { it.split(" | ").last().split(" ") }.sumOf { it.count { i -> i.length in intArrayOf(2, 3, 4, 7) } }

    override fun part2(input: List<String>): Int {
        TODO("Not yet implemented")
    }
}
