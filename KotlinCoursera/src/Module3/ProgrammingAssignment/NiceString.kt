package Module3.ProgrammingAssignment

fun String.isNice(): Boolean {
    val noBadSubString = setOf("ba", "be", "bu").none { this.contains(it) }

    val hasThreeVowels = count { it in "aeiou" } >= 3

    val hasDoubleLetter = zipWithNext().any { it.first == it.second }

    return listOf(noBadSubString, hasThreeVowels, hasDoubleLetter).count { it } >= 2
}

fun main() {
    println("abbb".isNice())
}