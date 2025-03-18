package Module4.OOP

/*Không cần tạo instance, có thể truy cập trực tiếp.
Chỉ có một instance duy nhất trong suốt vòng đời chương trình.
Truy cập qua ObjectName.method()
Tính năng không giống static*/

object Logger1 {
    fun log(message: String) {
        println("LOG: $message")
    }
}

fun main() {
    Logger1.log("Application started")  // Truy cập trực tiếp, không cần tạo instance
    Logger1.log("Something happened")
}
