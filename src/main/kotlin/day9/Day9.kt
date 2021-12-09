package day9

import Day

/**
 * @author Jordan Abraham
 */
object Day9 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int = with(HeightMap(input.toPoints(), input.first().length)) { findLowestPoints().sumOf { it.height + 1 } }

    override fun part2(input: List<String>): Int = with(HeightMap(input.toPoints(), input.first().length)) {
        findLowestPoints()
            .asSequence()
            .map { nextBasin(setOf(it)) }
            .distinct()
            .sortedByDescending { it.size }
            .take(3)
            .map { it.size }
            .reduce { a, b -> a * b }
    }

    private fun List<String>.toPoints(): List<Point> = buildList {
        this@toPoints.forEachIndexed { y, row ->
            row.forEachIndexed { x, int ->
                add(Point(x, y, int.digitToInt()))
            }
        }
    }
}
