package Module4.Properties

/*Khi khai báo một thuộc tinh trong Kotlin không cần khai báo getter
setter vì getter và setter sẽ được tự động tạo ra
nếu biến là val thì chỉ có getter được tự động tạo ra, con nếu biến
 là vả thì có cả getter và setter được tạo ra*/

val foo1 = run {
    println("Calculating the answer...")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }
//Trường hỗ trợ
class Person {
    var name: String = "Unknown"
        get() = field.uppercase()  // Truy cập giá trị lưu trữ trong field
        set(value) {
            field = value.trim()  // Cập nhật giá trị vào field
        }
}

fun main(args: Array<String>) {
    println("$foo1 $foo1 $foo2 $foo2")//Dap an la 3 vi foo1 chi thuc hien run 1 lan vi nos la kieu val
}