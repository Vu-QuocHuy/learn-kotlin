package Module4.OOP

/*
Có thể truy cập trực tiếp mà không cần tạo instance của class.
Có thể triển khai interface.
Tính năng giống static của Java
Truy cập qua ClassName.method()
Mỗi class chỉ có một companion object.*/

class C {
    companion object {
        @JvmStatic fun foo() {}
        fun bar() {}
    }
}

class Database {
    companion object {
        fun connect() {
            println("Database connected")
        }
    }
}

fun main() {
    C.foo()
    C.bar()
    C.Companion.foo()
    C.Companion.bar()
    Database.connect()  // Truy cập trực tiếp, không cần tạo instance của Database

}