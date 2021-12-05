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
        x1: Int,
        y1: Int,
        x2: Int,
        y2: Int,
        traverseDiagonally: Boolean = false
    ) {
        val diagonal = diagonal(x1, y1, x2, y2)
        if (diagonal && traverseDiagonally.not()) return
        if (diagonal) {
            var x = x1
            var y = y1
            while (true) {
                sheet[y][x] += 1
                if (x == x2) break
                x = if (x2 > x) ++x else --x
                y = if (y2 > y) ++y else --y
            }
        } else {
            (min(x1, x2)..max(x1, x2)).forEach { x ->
                (min(y1, y2)..max(y1, y2)).forEach { y ->
                    sheet[y][x] += 1
                }
            }
        }
    }

    fun numberOfOverlappingLines() = sheet.sumOf { row -> row.count { it >= 2 } }

    private fun diagonal(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = x1 != x2 && y1 != y2
}