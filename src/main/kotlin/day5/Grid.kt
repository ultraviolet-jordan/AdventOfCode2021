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
        from: Point,
        to: Point,
        traverseDiagonally: Boolean = false
    ) {
        val diagonal = diagonal(from, to)
        if (diagonal && traverseDiagonally.not()) return
        if (diagonal) {
            if (from.x > to.x) {
                traverseAndPlot(to, from, traverseDiagonally)
            } else range(from.x, to.x).forEachIndexed { index, x ->
                plot(if (to.y > from.y) from.y + index else from.y - index, x)
            }
        } else range(from.x, to.x).forEach { x ->
            range(from.y, to.y).forEach { y -> plot(y, x) }
        }
    }

    fun numberOfOverlappingLines() = points.sumOf { row -> row.count { it >= 2 } }

    private fun plot(y: Int, x: Int) = with(points) { this[y][x] += 1 }
    private fun diagonal(from: Point, to: Point): Boolean = from.x != to.x && from.y != to.y
    private fun range(from: Int, to: Int): IntRange = (min(from, to)..max(from, to))
}