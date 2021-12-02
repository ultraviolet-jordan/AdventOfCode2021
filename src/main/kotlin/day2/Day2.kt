package day2

import Day

/**
 * @author Jordan Abraham
 */
class Day2 : Day<List<String>, Int> {

    override fun solvePart1(input: List<String>): Int = with(Submarine(splitOf(input))) { horizontal * depth }
    override fun solvePart2(input: List<String>): Int = with(Submarine(splitOf(input), true)) { horizontal * depth }
}

private class Submarine(
    commands: List<List<String>>,
    val aiming: Boolean = false
) {
    var horizontal: Int = 0
    var depth: Int = 0
    var aim: Int = 0

    init {
        commands.forEach {
            val units = it.last().toInt()
            when (it.first()) {
                "forward" -> {
                    horizontal += units
                    if (aiming) depth += (aim * units)
                }
                "down" -> if (aiming) aim += units else depth += units
                "up" -> if (aiming) aim -= units else depth -= units
            }
        }
    }
}

private fun splitOf(list: List<String>): List<List<String>> = list.map { it.split(" ") }