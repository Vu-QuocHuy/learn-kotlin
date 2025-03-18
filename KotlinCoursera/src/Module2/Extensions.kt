package Module2

fun String.lastChar() = this.get(this.length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n)
        sb.append(this)
    return sb.toString()
}
fun main() {
    val c: Char = "abcd".lastChar()
    println(c)

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val q = """To code,
        |or not to code?...""".trimMargin()
    val a = """
        Keep calm
        and learn Kotlin""".trimIndent()
}