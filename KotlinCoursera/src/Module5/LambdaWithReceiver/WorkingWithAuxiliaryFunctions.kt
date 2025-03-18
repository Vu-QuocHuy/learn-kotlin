package Module5.LambdaWithReceiver

/*Trong Kotlin, có năm scope function quan trọng giúp xử lý đối tượng một cách
linh hoạt: with, let, run, apply và also.

with(obj) {} không phải là một extension function mà nhận object làm tham số,
bên trong lambda có thể tham chiếu object bằng this và trả về kết quả từ lambda.
Nó thường được dùng khi không cần trả về chính object mà chỉ thao tác trên đó.
obj.let {} là một extension function, gọi trực tiếp trên object, tham chiếu object
 bằng it và trả về kết quả từ lambda. Nó hữu ích khi cần kiểm tra null hoặc biến
 đổi object trước khi tiếp tục sử dụng.
obj.run {} tương tự let nhưng tham chiếu object bằng this thay vì it. Nó cũng trả về kết
quả từ lambda, thích hợp khi cần thao tác trên object rồi trả về một giá trị sau khi xử lý.
obj.apply {} tham chiếu object bằng this và luôn trả về chính object đó. Nó thường
 được dùng khi cần thiết lập hoặc cấu hình object trước khi sử dụng.
obj.also {} tham chiếu object bằng it và cũng trả về chính object đó. Nó hữu ích khi
 muốn thực hiện tác vụ phụ như logging hoặc debugging mà không làm thay đổi object.*/

interface X {
    var first: Int
    var second: Int
    var third: Int
}

interface Y {
    fun start()
    fun finish()
}

interface Z {
    fun init()
}

fun foo(x: X, y: Y?, z: Z) {
    x.apply {
        first = 1
        second = 2
        third = 3
    }
    y?.run {
            start()
            finish()
    }
    val result = z.apply { init() }
}