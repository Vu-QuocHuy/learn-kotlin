package Module4.OOP

/*
Class Delegation là một cơ chế trong Kotlin cho phép một lớp ủy quyền (delegate) việc thực thi
 một giao diện (interface) cho một đối tượng khác mà không cần tự mình triển khai tất cả các
 phương thức của giao diện đó. Điều này giúp tái sử dụng code, giảm thiểu việc viết lại logic
 và giúp code dễ bảo trì hơn.
 Trong Kotlin, bạn có thể dùng từ khóa by để ủy quyền việc triển khai một interface cho một
  đối tượng khác.
*/

// Định nghĩa một Interface
interface Printer {
    fun printMessage()
}

// Một lớp thực hiện interface Printer
class SimplePrinter : Printer {
    override fun printMessage() {
        println("Printing from SimplePrinter")
    }
}

// Một lớp khác ủy quyền việc triển khai Printer cho SimplePrinter
class AdvancedPrinter(printer: Printer) : Printer by printer

fun main() {
    val simplePrinter = SimplePrinter()
    val advancedPrinter = AdvancedPrinter(simplePrinter)

    advancedPrinter.printMessage() // Output: Printing from SimplePrinter

    val logger = ConsoleLogger()
    val appLogger = AppLogger(logger)

    appLogger.logInfo("Application started") // Output: INFO: Application started
    appLogger.logError("Something went wrong") // Output: ERROR: Something went wrong

}
