package Module4.OOP

class Foo(val first: Int, val second: Int)
data class Bar(val first: Int, val second: Int)

fun main() {
    val f1 = Foo(1, 2)
    val f2 = Foo(1, 2)
    println(f1 == f2)//ket qua la false vi f1 va f2 khong tham chieu den cung 1 dia chi

    val b1 = Bar(1, 2)
    val b2 = Bar(1, 2)
    println(b1 == b2)

}