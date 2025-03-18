package Module4.Properties

//Lazy properties
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

/*Lazy dùng với biên có kiểu val, trong khi đó late dùng với var
late không sử dụng cho các biến có kiểu dữ liệu nguyên thủy
*/
class MyClass {
    lateinit var lateinitVar: String
    fun initializationLogic() {
        println(this::lateinitVar.isInitialized)
        lateinitVar = "value"
        println(this::lateinitVar.isInitialized)
    }
}

fun main() {
//    println(lazyValue)
//    println(lazyValue)
}