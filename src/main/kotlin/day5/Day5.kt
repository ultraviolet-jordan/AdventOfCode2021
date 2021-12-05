package day5

import Day
import kotlin.math.max

/**
 * @author Jordan Abraham
 */
object Day5 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int {
        val points = input.toGridPoints()
        return with(Grid(points.maxOf())) {
            points.forEach {
                traverseAndPlot(
                    it.first().split(",").first().toInt(),
                    it.last().split(",").first().toInt(),
                    it.first().split(",").last().toInt(),
                    it.last().split(",").last().toInt()
                )
            }
            numberOfOverlappingLines()
        }
    }

    override fun part2(input: List<String>): Int {
        val points = input.toGridPoints()
        return with(Grid(points.maxOf())) {
            points.forEach {
                traverseAndPlot(
                    it.first().split(",").first().toInt(),
                    it.last().split(",").first().toInt(),
                    it.first().split(",").last().toInt(),
                    it.last().split(",").last().toInt(),
                    true
                )
            }
            numberOfOverlappingLines()
        }
    }

    private fun List<String>.toGridPoints(): List<List<String>> = map { it.split(Regex("\\s->\\s")) }
    private fun List<List<String>>.maxOf(): Int = (map { max(it.first().split(",").first().toInt(), it.last().split(",").first().toInt()) }.maxOrNull() ?: 0) + 1
}