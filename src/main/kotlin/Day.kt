/**
 * @author Jordan Abraham
 */
interface Day<T, R> {
    fun solveSolution1(input: T): R
    fun solveSolution2(input: T): R
}

inline fun <reified T> intListOf(fileName: String): List<Int> = T::class.java.getResourceAsStream(fileName)!!.bufferedReader().lines().map { it.toInt() }.toList()