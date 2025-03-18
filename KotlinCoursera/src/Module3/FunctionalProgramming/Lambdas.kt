package Module3.FunctionalProgramming

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 5)) // ✅ Output: 8
    val greet: (String) -> String = { name -> "Hello, $name!" }
    println(greet("Kotlin")) // ✅ Output: Hello, Kotlin!
//    Nếu lambda chỉ có một tham số, Kotlin cung cấp từ khóa it để sử dụng thay vì đặt tên tham số:
    val square: (Int) -> Int = { it * it }
    println(square(4)) // ✅ Output: 16
    val people = listOf("Tom", "Anna", "Bob")
    val sortedPeople = people.sortedBy { it.length }
    println(sortedPeople) // ✅ Output: [Tom, Bob, Anna]
    val names = listOf("Alice", "Bob", "Charlie")

    names.forEach { println("Hello, $it!") }

}