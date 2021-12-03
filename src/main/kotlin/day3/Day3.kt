package day3

import Day
import java.util.Collections.frequency

/**
 * @author Jordan Abraham
 */
object Day3 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int {
        val size = input.first().length
        val builder = StringBuilder()
        (0 until size).forEach { b ->
            builder.append("${input.map { it[b].digitToInt() }.bitVal()}")
        }
        val bit = builder.toString()
        val gammaRate = bit.toInt(2)
        val epsilonRate = bit.map { it.digitToInt() }
            .map { if (it == 0) 1 else 0 }
            .joinToString()
            .replace(", ", "")
            .toInt(2)
        return gammaRate * epsilonRate
    }

    override fun part2(input: List<String>): Int {
        TODO("Not yet implemented")
    }

    private fun List<Int>.bitVal(): Int = when {
        frequency(this, 0) > frequency(this, 1) -> 0
        else -> 1
    }
}