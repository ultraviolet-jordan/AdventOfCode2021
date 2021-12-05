package day5

import kotlin.math.max
import kotlin.math.min

/**
 * @author Jordan Abraham
 */
class Grid(
    size: Int
) {
    private val sheet = Array(size) { IntArray(size) { 0 } }

    fun traverseAndPlot(
        first: Point,
        second: Point,
        traverseDiagonally: Boolean = false
    ) {
        val diagonal = diagonal(first, second)
        if (diagonal && traverseDiagonally.not()) return
        if (diagonal) {
            var x = first.x
            var y = first.y
            while (true) {
                sheet[y][x] += 1
                if (x == second.x) break
                x = if (second.x > x) ++x else --x
                y = if (second.y > y) ++y else --y
            }
        } else {
            (min(first.x, second.x)..max(first.x, second.x)).forEach { x ->
                (min(first.y, second.y)..max(first.y, second.y)).forEach { y ->
                    sheet[y][x] += 1
                }
            }
        }
    }

    fun numberOfOverlappingLines() = sheet.sumOf { row -> row.count { it >= 2 } }

    private fun diagonal(first: Point, second: Point): Boolean = first.x != second.x && first.y != second.y
}