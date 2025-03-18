package Module4.OOP

/*Khi cần tạo một đối tượng ngay lập tức mà không cần định nghĩa một class riêng biệt.
Thường dùng khi implement interface hoặc class abstract ngay tại chỗ.
Tạo object trong code và gọi phương thức của nó
Không giống tính năng static của Java*/

interface ClickListener {
    fun onClick()
}

fun main() {
    val buttonClickListener = object : ClickListener {
        override fun onClick() {
            println("Button clicked!")
        }
    }

    buttonClickListener.onClick()  // Gọi phương thức từ object expression
}
