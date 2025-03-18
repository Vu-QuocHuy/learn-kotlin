package Module5.Sequences

fun fibonacci(): Sequence<Int> = sequence {
    var a = 0
    var b = 1
    while (true) {
        yield(a)
        val temp = a + b
        a = b
        b = temp
    }
}

fun main() {
    println(fibonacci().take(4).toList().toString())
    fibonacci().take(10).toList().toString()
}