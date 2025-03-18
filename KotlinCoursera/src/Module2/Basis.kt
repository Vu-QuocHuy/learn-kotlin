package Module2

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

fun displayMax(a: Int, b: Int): Unit {
    println(max(a, b))
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello $name")

    println("Hello, ${args.getOrNull(0)}!")
    println("First ${foo()}, second ${foo()}")
    var max = max(5, 9)
    println("Max la: $max")

    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"
    ))

    println(sum())
}