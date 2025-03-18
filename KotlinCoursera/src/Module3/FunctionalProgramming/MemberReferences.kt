package Module3.FunctionalProgramming

fun isEven(i: Int): Boolean = i % 2 == 0


class Person(val name: String, val age: Int) {
    //tham chiếu thành viên không ràng buộc
    fun isOlder(ageLimit: Int) = age > ageLimit
    //tham chiếu thành viên ràng buộc
    fun getAgePredicate() = this::isOlder
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.any(::isEven))
    println(list.filter (::isEven))
//tham chiếu thành viên không ràng buộc
    val agePredicate = Person::isOlder
    val alice = Person("Alice", 29)
    println(agePredicate(alice, 21))

//tham chiếu thành viên ràng buộc
    val predicate = alice.getAgePredicate()
}