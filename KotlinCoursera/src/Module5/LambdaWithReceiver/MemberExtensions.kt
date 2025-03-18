package Module5.LambdaWithReceiver

class Words {
    private val list = mutableListOf<String>()

    fun String.record() {
        list.add(this)
    }

    operator fun String.unaryPlus() {
        list.add(this)
    }

    override fun toString() = list.toString()
}

fun main() {
    val words = Words()
    with(words) {
        "one".record()  // Gọi extension function `record`
        +"two"          // Gọi extension function `unaryPlus`
    }
    println(words.toString()) // Kết quả: [one, two]
    println(arrayOf(1, 2) == arrayOf(1, 2))
}
