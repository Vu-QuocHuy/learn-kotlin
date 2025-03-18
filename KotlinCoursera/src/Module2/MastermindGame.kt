package Module2

data class Result(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Result {
    var rightPosition = 0
    val secretChars = mutableListOf<Char>()
    val guessChars = mutableListOf<Char>()
    for (i in secret.indices) {
        if (secret[i] == guess[i]) {
            rightPosition++
        } else {
            secretChars.add(secret[i])
            guessChars.add(guess[i])
        }
    }
    var wrongPosition = 0
    for (char in guessChars) {
        if (char in secretChars) {
            wrongPosition++
            secretChars.remove(char)
        }
    }
    return Result(rightPosition, wrongPosition)
}

fun main() {
    val result = evaluateGuess("ABCD", "ACBD")
    println("Right positions: ${result.rightPosition}, Right letters in wrong positions: ${result.wrongPosition}")
    println("BCDE".zip("ABCD"))
}



