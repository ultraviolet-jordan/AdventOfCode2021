/**
 * @author Jordan Abraham
 */
inline fun <reified T> logger(): System.Logger = System.getLogger(T::class.java.name)

fun timeOf(time: Long): String = "Finished in $time milliseconds."