/**
 * @author Jordan Abraham
 */
interface Day<R> {
    fun solveSolution1(input: List<Int>): R
    fun solveSolution2(input: List<Int>): R
}

inline fun <reified T> intListOf(fileName: String): List<Int> = T::class.java.getResourceAsStream(fileName)!!.bufferedReader().lines().map { it.toInt() }.toList()