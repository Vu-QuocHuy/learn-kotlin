package Module5.LambdaWithReceiver

/*Trong Kotlin, lambda with receiver là một tính năng mạnh mẽ cho phép
bạn định nghĩa các hàm với một receiver (đối tượng tiếp nhận), giúp bạn
có thể gọi các phương thức của đối tượng đó một cách trực tiếp mà không
cần phải chỉ rõ tên đối tượng mỗi lần.*/


//Lambda with receiver cũng được sử dụng để tạo các hàm mở rộng có thể
// giúp làm gọn mã và tăng khả năng đọc hiểu:
fun StringBuilder.addHtml(tag: String, content: String) {
    append("<$tag>")
    append(content)
    append("</$tag>")
}

fun main() {
//    Ở đây, String.() cho biết lambda này là một extension function của
//    String, và trong lambda, bạn có thể gọi this để truy cập vào đối tượng String.
    val lambda: String.() -> Unit = {
        println(this) // this ám chỉ đối tượng String
    }

    val greeting = StringBuilder().apply {
        append("Hello")
        append(" World!")
    }
    println(greeting.toString()) // Output: Hello World!

    val result = StringBuilder().apply {
        addHtml("h1", "Hello, Kotlin!")
        addHtml("p", "This is a simple example.")
    }
    println(result.toString())
}