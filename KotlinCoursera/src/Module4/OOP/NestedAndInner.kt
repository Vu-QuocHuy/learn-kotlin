package Module4.OOP

class Outer {
    val name = "Outer"

    class Nested {
        fun hello() = "Hello from Nested class"
    }
}

class Outer1 {
    val name = "Outer"

    inner class Inner {
        fun hello() = "Hello from Inner class, outer name: $name"
    }
}

fun main() {
    val nested = Outer.Nested() // Không cần tạo đối tượng Outer
    println(nested.hello()) // Output: Hello from Nested class

    val outer1 = Outer1()
    val inner = outer1.Inner() // Cần một đối tượng Outer để tạo Inner
    println(inner.hello()) // Output: Hello from Inner class, outer name: Outer
}

/*
*Dùng Nested Class khi:
Lớp bên trong không cần truy cập dữ liệu từ lớp cha.
Ví dụ: Một helper class chỉ liên quan đến Outer nhưng không cần dùng đến dữ liệu của nó.

* * Dùng Inner Class khi:
Lớp bên trong cần truy cập thuộc tính hoặc phương thức của lớp cha.
Ví dụ: Khi lớp con cần thao tác với trạng thái của lớp cha.*/