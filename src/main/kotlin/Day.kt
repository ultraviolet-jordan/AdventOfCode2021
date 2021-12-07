/**
 * @author Jordan Abraham
 */
interface Day<T, R> {
    fun part1(input: T): R
    fun part2(input: T): R
}

inline fun <reified T> String.listOfSplit(deliminator: String): List<T> = split(deliminator).map {
    when (T::class) {
        Int::class -> it.toInt() as T
        String::class -> it as T
        else -> throw RuntimeException("Exception caught because of an unknown type.")
    }
}

inline fun <reified T> List<String>.listOfSplit(deliminator: String): List<T> = map {
    it.split(deliminator).map { string ->
        when (T::class) {
            Int::class -> string.toInt() as T
            String::class -> string as T
            else -> throw RuntimeException("Exception caught because of an unknown type.")
        }
    }
}.first()
