/**
 * @author Jordan Abraham
 */
inline fun <reified T> logger(): System.Logger = System.getLogger(T::class.java.name)

fun timeOf(time: Long): String = "Finished in $time milliseconds."

inline fun <reified T> listOf(resource: String): List<T> {
    return Day::class.java.getResourceAsStream(resource)!!.bufferedReader().lines().filter { it.isNotBlank() }.map {
        when (T::class) {
            Int::class -> it.toInt() as T
            String::class -> it.toString() as T
            else -> throw RuntimeException("Exception caught because of an unknown type.")
        }
    }.toList()
}