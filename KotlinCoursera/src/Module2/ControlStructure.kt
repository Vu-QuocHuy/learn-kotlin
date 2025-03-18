package Module2

fun main() {
    val intRange: IntRange = 1..9
    val anotherIntRange: IntRange = 1 until 10
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
//    val dateRange: ClosedRange<MyDate> = startDate..endDate
    for (ch in "abc") {
        print(ch + 1)
    }
    println()
    println(stringRange)
}