package Module4.Properties

import kotlin.random.Random

val foo: Int
    get() = Random.nextInt()

fun main() {
    println(foo)
    println(foo)
    println(foo)
}