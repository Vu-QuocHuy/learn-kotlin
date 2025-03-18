package Module4.OOP

// Interface định nghĩa phương thức fetchData()
interface DataProvider {
    fun fetchData(): String
}

// Object triển khai interface DataProvider
object NetworkDataProvider : DataProvider {
    override fun fetchData() = "Data from network"  // Trả về dữ liệu từ mạng
}

// DataManager ủy quyền cho object NetworkDataProvider
class DataManager : DataProvider by NetworkDataProvider

fun main() {
    val dataManager = DataManager()  // Tạo đối tượng DataManager
    println(dataManager.fetchData())  // Gọi fetchData(), thực tế gọi từ NetworkDataProvider
    // Output: Data from network
}
