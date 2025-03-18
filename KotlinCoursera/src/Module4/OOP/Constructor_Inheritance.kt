package Module4.OOP

class Person(name: String) {
    val name: String
//    khoi ma trong phan than init tiep tuc cong viec cua constructor
    init {
        this.name = name
    }
}

class Rectangle(val height: Int, val width: Int) {
    constructor(side: Int) : this(side, side) {

    }
}

open class Parent1(val name: String)

open class Child1 : Parent1 {
    constructor(name: String, param: Int) : super(name)
}

open class Parent {
    open val foo = 1
    init { print("parent ")
        println(foo)
    }
}

class Child : Parent() {
    override val foo = 2
//    init { print("child")
//    }
}

fun main() {
    Child()
}
/*Trong Kotlin, khi một lớp con ghi đè một thuộc tính open, giá trị của
thuộc tính mới sẽ chỉ được sử dụng sau khi constructor của lớp con hoàn tất.
*
Khi Parent đang trong quá trình khởi tạo, Child vẫn chưa khởi tạo xong
ết quả, foo của Child lúc này là 0 (giá trị mặc định của Int trong Kotlin).
 */