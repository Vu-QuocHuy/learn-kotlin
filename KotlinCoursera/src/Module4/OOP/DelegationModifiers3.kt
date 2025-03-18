package Module4.OOP

// Interface Printer chứa phương thức printMessage()
interface Printer1 {
    fun printMessage()
}

// Interface Scanner chứa phương thức scanDocument()
interface Scanner {
    fun scanDocument()
}

// Class OfficePrinter triển khai Printer
class OfficePrinter : Printer1 {
    override fun printMessage() {
        println("Printing from OfficePrinter")  // In từ máy in
    }
}

// Class OfficeScanner triển khai Scanner
class OfficeScanner : Scanner {
    override fun scanDocument() {
        println("Scanning document...")  // Quét tài liệu
    }
}

// MultiFunctionDevice ủy quyền cho cả Printer và Scanner
class MultiFunctionDevice(printer: Printer1, scanner: Scanner) : Printer1 by printer, Scanner by scanner
// MultiFunctionDevice không cần tự triển khai printMessage() và scanDocument()

fun main() {
    val printer = OfficePrinter()  // Tạo đối tượng máy in
    val scanner = OfficeScanner()  // Tạo đối tượng máy quét

    val device = MultiFunctionDevice(printer, scanner)  // Tạo thiết bị đa chức năng

    device.printMessage()  // Gọi phương thức từ OfficePrinter
    // Output: Printing from OfficePrinter

    device.scanDocument()  // Gọi phương thức từ OfficeScanner
    // Output: Scanning document...
}
