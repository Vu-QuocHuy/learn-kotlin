package Module4.OOP

infix fun Int.add(x: Int): Int {
    return this + x
}

class Person1(val name: String) {
    infix fun isFriendOf(other: Person1): Boolean {
        return this.name.length == other.name.length
    }
}

fun main() {
    val result = 5 add 3  // Không cần viết 5.add(3)
    println(result) // Output: 8

    val alice = Person1("Alice")
    val bob = Person1("David")

    println(alice isFriendOf bob) // Không cần viết alice.isFriendOf(bob)
}
