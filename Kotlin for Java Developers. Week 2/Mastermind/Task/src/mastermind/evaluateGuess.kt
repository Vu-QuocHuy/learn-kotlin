package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
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
    return Evaluation(rightPosition, wrongPosition)
}
