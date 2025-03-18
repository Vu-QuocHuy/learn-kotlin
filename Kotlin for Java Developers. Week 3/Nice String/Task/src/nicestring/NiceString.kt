package nicestring

fun String.isNice(): Boolean {
    val noBadSubStrings = !this.contains("ba") && !this.contains("be") && !this.contains("bu")

    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val vowelsCount = this.count{it in vowels}
    val hasEnoughVowels = vowelsCount >= 3

    val hasDoubleLetter = this.zipWithNext().any { it.first == it.second }

    return listOf(noBadSubStrings, hasEnoughVowels, hasDoubleLetter).count{it} >= 2
}

fun main() {
    println("bac".isNice())
    println("aza".isNice())
    println("abaca".isNice())
    println("baaa".isNice())
    println("aaab".isNice())
}