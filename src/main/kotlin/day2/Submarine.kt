package day2

/**
 * @author Jordan Abraham
 */
class Submarine(
    commands: List<List<String>>,
    private val aiming: Boolean = false
) {
    var horizontal: Int = 0
    var depth: Int = 0
    var aim: Int = 0

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