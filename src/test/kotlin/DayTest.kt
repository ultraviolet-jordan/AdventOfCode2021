/**
 * @author Jordan Abraham
 */
inline fun <reified T> logger(): System.Logger = System.getLogger(T::class.java.name)

inline fun <reified T> listOf(resource: String): List<T> {
    val reader = Day::class.java.getResourceAsStream(resource)!!.bufferedReader()
    val list = reader.lines().filter { it.isNotBlank() }.map {
        when (T::class) {
            Int::class -> it.toInt() as T
            String::class -> it.toString() as T
            else -> throw RuntimeException("Exception caught because of an unknown type.")
        }
    }.toList()
    reader.close()
    return list
}
