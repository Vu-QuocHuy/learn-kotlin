package Module5.LambdaWithReceiver

/*Trong Kotlin, with là một hàm chuẩn (standard function) rất hữu ích để giảm thiểu việc
 lặp lại tên đối tượng khi bạn cần thực hiện nhiều thao tác trên cùng một đối tượng. Hàm
  with cho phép bạn thực thi một khối mã (block) với receiver là đối tượng và truy cập
  trực tiếp vào các thuộc tính hoặc phương thức của đối tượng đó mà không cần phải gọi
  object.property mỗi lần.
  object: Đây là đối tượng mà bạn muốn thao tác.
this: Bên trong block with, this đại diện cho đối tượng object, và bạn có thể sử dụng nó
để truy cập các thuộc tính hoặc phương thức của đối tượng đó mà không cần phải gọi tên
đối tượng.*/
fun main() {
    val stringBuilder = StringBuilder()

    // Sử dụng `with` để thực hiện nhiều thao tác trên StringBuilder
    val result = with(stringBuilder) {
        append("Hello, ")
        append("Kotlin!")
        toString()  // Trả về kết quả cuối cùng là chuỗi
    }

    // In kết quả
    println(result)  // Output: Hello, Kotlin!
}