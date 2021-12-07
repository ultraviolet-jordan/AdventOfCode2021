/**
 * @author Jordan Abraham
 */
interface Day<T, R> {
    fun part1(input: T): R
    fun part2(input: T): R
}

inline fun <reified T> List<String>.splitToList(deliminator: String): List<T> = map {
    it.split(",").map { string ->
        return@map when (T::class) {
            Int::class -> string.toInt() as T
            String::class -> string as T
            else -> throw RuntimeException("Exception caught because of an unknown type.")
        }
    }
}.first()
