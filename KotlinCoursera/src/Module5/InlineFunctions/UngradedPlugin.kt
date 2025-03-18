package Module5.InlineFunctions

fun filterNonZero(list: List<Int>) = list.filter { it != 0 }

fun filterNonZeroGenerated(list: List<Int>): List<Int> {
    val destination = ArrayList<Int>()
    for (element in list) {
        if (element != 0)
            destination.add(element)
    }
    return destination
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    println(filterNonZero(list).toString())
    println(filterNonZeroGenerated(list).toString())
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            destination.add(element)
        }
    }
    return destination
}
