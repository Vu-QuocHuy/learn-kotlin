package Module2

open class Parent
class Child: Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"

fun main(args: Array<String>) {
    val parent: Parent = Child()
    println(parent.foo())
}
/*
Hàm mở rộng (extension function) không hỗ trợ đa hình.
Khi gọi parent.foo(), trình biên dịch Kotlin chỉ xét kiểu tĩnh của parent (là Parent).
Do đó, fun Parent.foo() được gọi thay vì fun Child.foo().
 */