package Module5.InlineFunctions

/*Bình thường khi gọi một hàm
Nếu bạn gọi một hàm thông thường, chương trình sẽ:

Đẩy các tham số vào stack.
Gọi hàm đó.
Sau khi hàm chạy xong, kết quả được trả về.*/
// Ví dụ không dùng inline:
fun square(x: Int): Int {
    return x * x
}

/*Khi sử dụng inline
Nếu bạn dùng inline, Kotlin sẽ thay thế lời gọi hàm bằng nội dung của hàm đó.*/
inline fun square1(x: Int): Int {
    return x * x
}

fun higherOrderFunction(operation: (Int) -> Int, value: Int): Int {
    return operation(value)
}

inline fun higherOrderFunction1(operation: (Int) -> Int, value: Int): Int {
    return operation(value)
}


fun main() {
    //không dùng inline
    println(square(5))
    println(higherOrderFunction({ it * it }, 5))
    //dùng inline
    println(square1(5))//compiler sẽ đổi thành println(5 * 5)
    println(higherOrderFunction1({ it * it }, 5))//compiler sẽ đổi thành println(5 * 5)
}
