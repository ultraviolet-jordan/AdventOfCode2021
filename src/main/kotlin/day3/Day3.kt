package day3

import Day
import java.util.Collections.frequency

/**
 * @author Jordan Abraham
 */
object Day3 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int {
        val bit = with(StringBuilder()) {
            repeat(input.first().length) {
                append("${input.toComparedBit(it)}")
            }
            toString()
        }
        val gammaRate = bit.toInt(2)
        val epsilonRate = bit.map { it.digitToInt() }
            .map { if (it == 0) 1 else 0 }
            .joinToString("")
            .toInt(2)

        return gammaRate * epsilonRate
    }

    override fun part2(input: List<String>): Int {
        val oxygenGeneratorRating = with(input.toMutableList()) {
            repeat(input.first().length) {
                removeIf { string -> size > 1 && string[it].digitToInt() != toComparedBit(it) }
            }
            last().toInt(2)
        }

        val co2ScrubberRating = with(input.toMutableList()) {
            repeat(input.first().length) {
                removeIf { string -> size > 1 && string[it].digitToInt() != toComparedBitInv(it) }
            }
            last().toInt(2)
        }

        return oxygenGeneratorRating * co2ScrubberRating
    }

    private fun List<String>.toComparedBit(index: Int): Int = with(map { it[index].digitToInt() }) {
        when {
            frequency(this, 0) == frequency(this, 1) -> 1
            frequency(this, 0) > frequency(this, 1) -> 0
            else -> 1
        }
    }

    private fun List<String>.toComparedBitInv(index: Int): Int = with(map { it[index].digitToInt() }) {
        when {
            frequency(this, 0) == frequency(this, 1) -> 0
            frequency(this, 0) < frequency(this, 1) -> 0
            else -> 1
        }
    }
}