/*
package Module4.OOP

class Box<T>(val value: T) { // T là một kiểu dữ liệu tổng quát
    fun getValue(): T {
        return value
    }
}

fun <T> printItem(item: T) { // Hàm tổng quát với kiểu T
    println(item)
}

fun <T : Number> doubleValue(value: T): Double {
    return value.toDouble() * 2
}

interface Printable {
    fun print()
}

fun <T> printObject(item: T) where T : Number, T : Printable {
    item.print()
    println("Value: $item")
}

class Factory<T> {
    companion object {
        fun <T> create(): Factory<T> {
            return Factory()
        }
    }
}

fun main() {
    val intBox = Box(42) // T tự động suy luận là Int
    val stringBox = Box("Hello") // T tự động suy luận là String

    println(intBox.getValue())  // Output: 42
    println(stringBox.getValue())  // Output: Hello

    printItem(123)  // Output: 123
    printItem("Kotlin")  // Output: Kotlin

    println(doubleValue(10)) // Output: 20.0
    println(doubleValue(5.5)) // Output: 11.0

    val factory: Factory<Int> = Factory.create()
    println(factory) // Output: Factory@xxxxxx
}


*/
