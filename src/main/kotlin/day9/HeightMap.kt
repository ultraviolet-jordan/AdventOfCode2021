package day9

/**
 * @author Jordan Abraham
 */
class HeightMap(
    private val points: List<Point>,
    private val width: Int
) {
    fun findLowestPoints(): List<Point> = points.filter { point -> surrounding(point).none { it.height <= point.height } }

    fun nextBasin(currentBasin: Set<Point>): Set<Point> = with(currentBasin.toMutableSet()) {
        map { point -> surrounding(point, true) }.forEach { addAll(it) }
        if (size != currentBasin.size) return nextBasin(this)
        return this
    }

    private fun surrounding(
        point: Point,
        filterPeak: Boolean = false
    ): List<Point> {
        val north = neighboring(point.x, point.y - 1)
        val south = neighboring(point.x, point.y + 1)
        val east = neighboring(point.x - 1, point.y)
        val west = neighboring(point.x + 1, point.y)
        if (filterPeak) return listOfNotNull(north, south, east, west).filter { it.height != 9 }
        return listOfNotNull(north, south, east, west)
    }

    private fun neighboring(x: Int, y: Int): Point? {
        if (x < 0 || x >= width || y < 0) return null
        return points.getOrNull(y * width + x)
    }
}
