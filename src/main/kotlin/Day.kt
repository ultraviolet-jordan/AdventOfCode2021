/**
 * @author Jordan Abraham
 */
interface Day<T, R> {
    fun solveSolution1(input: T): R
    fun solveSolution2(input: T): R
}

inline fun <reified T> listOf(resource: String): List<T> {
    return Day::class.java.getResourceAsStream(resource)!!.bufferedReader().lines().map {
        when (T::class) {
            Int::class -> it.toInt() as T
            else -> throw RuntimeException("Exception caught because of an unknown type.")
        }
    }.toList()
}