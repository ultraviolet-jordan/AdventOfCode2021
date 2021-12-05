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
            } else {
                rangeX(first, second).forEachIndexed { index, x ->
                    points[nextY(first, second, index)][x] += 1
                }
            }
        } else {
            rangeX(first, second).forEach { x ->
                rangeY(first, second).forEach { y ->
                    points[y][x] += 1
                }
            }
        }
    }

    fun numberOfOverlappingLines() = points.sumOf { row -> row.count { it >= 2 } }

    private fun diagonal(first: Point, second: Point): Boolean = first.x != second.x && first.y != second.y
    private fun rangeX(first: Point, second: Point): IntRange = (min(first.x, second.x)..max(first.x, second.x))
    private fun rangeY(first: Point, second: Point): IntRange = (min(first.y, second.y)..max(first.y, second.y))
    private fun nextY(first: Point, second: Point, index: Int): Int = if (second.y > first.y) first.y + index else first.y - index
}