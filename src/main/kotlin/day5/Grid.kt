package day5

import kotlin.math.max
import kotlin.math.min

/**
 * @author Jordan Abraham
 */
class Grid(
    size: Int
) {
    private val points = Array(size) { IntArray(size) { 0 } }

    fun traverseAndPlot(
        first: Point,
        second: Point,
        traverseDiagonally: Boolean = false
    ) {
        val diagonal = diagonal(first, second)
        if (diagonal && traverseDiagonally.not()) return
        if (diagonal) {
            if (first.x > second.x) {
                traverseAndPlot(second, first, traverseDiagonally)
            } else range(first.x, second.x).forEachIndexed { index, x ->
                plot(nextY(first, second, index), x)
            }
        } else range(first.x, second.x).forEach { x ->
            range(first.y, second.y).forEach { y -> plot(y, x) }
        }
    }

    fun numberOfOverlappingLines() = points.sumOf { row -> row.count { it >= 2 } }

    private fun plot(y: Int, x: Int) = with(points) { this[y][x] += 1 }
    private fun diagonal(first: Point, second: Point): Boolean = first.x != second.x && first.y != second.y
    private fun range(from: Int, to: Int): IntRange = (min(from, to)..max(from, to))
    private fun nextY(first: Point, second: Point, index: Int): Int = if (second.y > first.y) first.y + index else first.y - index
}