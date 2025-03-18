package Module4.Properties

val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..lastIndex

val String.medianChar
    get(): Char? {
        println("Calculating...")
        return getOrNull(length / 2)
    }

fun main() {
    println("abc".lastIndex)
    println("abc".indices)

    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)
}