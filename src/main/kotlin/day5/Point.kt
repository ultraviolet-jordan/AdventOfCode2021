package day5

import kotlin.math.max
import kotlin.math.min

/**
 * @author Jordan Abraham
 */
class Point(
    val x: Int,
    val y: Int
) {
    fun xRangeTo(to: Point): IntRange = min(x, to.x)..max(x, to.x)
    fun yRangeTo(to: Point): IntRange = min(y, to.y)..max(y, to.y)
}