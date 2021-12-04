package day2

/**
 * @author Jordan Abraham
 */
class Submarine(
    commands: List<List<String>>,
    private val aiming: Boolean = false
) {
    var horizontal = 0
    var depth = 0
    var aim = 0

    init {
        commands.forEach {
            val units = it.last().toInt()
            when (it.first()) {
                "forward" -> {
                    horizontal += units
                    if (aiming) depth += (aim * units)
                }
                "down" -> if (aiming) aim += units else depth += units
                "up" -> if (aiming) aim -= units else depth -= units
            }
        }
    }
}