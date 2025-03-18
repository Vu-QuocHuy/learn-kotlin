package Module5.InlineFunctions

/*Cách hoạt động của Sequence
Cơ chế Lazy (tính toán lười biếng)
Khi gọi một phương thức như map, filter, nó không thực sự thực hiện ngay mà chỉ tạo ra một chuỗi xử lý.
Chỉ khi có terminal operation (ví dụ toList(), first(), count(), forEach(),...) thì Sequence mới bắt đầu thực thi.
Khi nào nên dùng Sequence?
Khi làm việc với dữ liệu lớn để tiết kiệm bộ nhớ.
Khi có nhiều phép biến đổi dữ liệu (map, filter, take,...) và muốn tránh tạo danh sách trung gian.
Khi cần xử lý pipeline và chỉ cần lấy một số phần tử đầu tiên (take(n))*/

fun m(i: Int): Int {
    print("m$i ")
    return i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

val numbers = generateSequence(3) { n ->
    println("Generating element...")
    (n + 1).takeIf { it < 7 }
}

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    list1.map(::m).filter(::f)  //m1 m2 m3 m4 f1 f2 f3 f4
    list1.asSequence().map(::m).filter(::f).toList()
    list1.asSequence().map(::m).filter(::f)
    list1.asSequence().filter(::f).map(::m).toList()
    println(numbers.first())
    println("---- asSequence() ----")
    val list = listOf(1, 2, 3, 4, 5).asSequence()
        .map { it * 2 } // Nhân đôi giá trị
        .filter { it % 3 == 0 } // Lọc ra số chia hết cho 3
        .toList() // Convert về danh sách
    println(list) // Kết quả: [6]

    println("\n---- sequence { } ----")
    val mySequence = sequence {
        println("Generating numbers...")
        yield(1) // Yield một giá trị đơn lẻ
        yieldAll(2..4) // Yield một range
        yieldAll(listOf(5, 6)) // Yield một danh sách
    }
    println(mySequence.toList()) // Kết quả: [1, 2, 3, 4, 5, 6]

    println("\n---- generateSequence() ----")
    val generatedSeq = generateSequence(1) { it * 2 } // Tạo dãy số nhân 2
        .take(5) // Lấy 5 phần tử đầu tiên
        .toList()
    println(generatedSeq) // Kết quả: [1, 2, 4, 8, 16]

    println("\n---- Kết hợp tất cả ----")
    val combinedSequence = sequence {
        yieldAll(listOf(1, 2, 3).asSequence()) // Chuyển đổi danh sách thành sequence
        yieldAll(generateSequence(10) { it + 10 }.take(3)) // Tạo dãy số tăng dần
    }
    println(combinedSequence.toList()) // Kết quả: [1, 2, 3, 10, 20, 30]
}

