package Module4.OOP

// Interface định nghĩa hai phương thức logInfo() và logError()
interface Logger {
    fun logInfo(message: String)
    fun logError(error: String)
}

// ConsoleLogger triển khai Logger
class ConsoleLogger : Logger {
    override fun logInfo(message: String) {
        println("INFO: $message")  // Ghi log thông tin
    }

    override fun logError(error: String) {
        println("ERROR: $error")  // Ghi log lỗi
    }
}

// AppLogger ủy quyền Logger cho ConsoleLogger, nhưng ghi đè logError()
class AppLogger(logger: Logger) : Logger by logger {
    override fun logError(error: String) {
        println("AppLogger ERROR: $error")  // Ghi đè logError() theo cách riêng
    }
}

fun main() {
    val logger = ConsoleLogger()  // Tạo đối tượng ConsoleLogger
    val appLogger = AppLogger(logger)  // Ủy quyền cho ConsoleLogger

    appLogger.logInfo("Application started")  // Gọi logInfo() từ ConsoleLogger
    // Output: INFO: Application started

    appLogger.logError("Something went wrong")  // Gọi logError() từ AppLogger (vì đã ghi đè)
    // Output: AppLogger ERROR: Something went wrong
}
