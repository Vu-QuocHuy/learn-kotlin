package Module3.FunctionalProgramming

fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return listOf()
        listOf(it, it)
    }
}

fun duplicateNonZero1(list: List<Int>): List<Int> {
    return list.flatMap(fun (e): List<Int> {
        if (e == 0) return listOf()
        return listOf(e, e)
    })
}

fun main() {
    println(duplicateNonZero(listOf(3, 0, 5)))
    println(duplicateNonZero1(listOf(3, 0, 5)))
    val list = listOf(0, 1, 2, 3, 4, 5)
    list.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}