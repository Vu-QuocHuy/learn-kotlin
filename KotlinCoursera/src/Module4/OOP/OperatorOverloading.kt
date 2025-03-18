package Module4.OOP

/*Để nạp chồng toán tử trong Kotlin, bạn cần:
Dùng từ khóa operator.
Override một hàm có tên tương ứng với toán tử.
Trả về kiểu dữ liệu phù hợp.*/

// Lớp biểu diễn Vector 2D
data class Vector(val x: Int, val y: Int) {

    // Overload toán tử + bằng cách định nghĩa operator fun plus()
    operator fun plus(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }

    // Overload toán tử -
    operator fun minus(other: Vector): Vector {
        return Vector(this.x - other.x, this.y - other.y)
    }

    // Overload toán tử * với một số nguyên
    operator fun times(scalar: Int): Vector {
        return Vector(this.x * scalar, this.y * scalar)
    }
}



fun main() {
    val v1 = Vector(3, 4)
    val v2 = Vector(1, 2)

    val resultP = v1 + v2 // Gọi v1.plus(v2)
    println(resultP) // Output: Vector(x=4, y=6)

    val resultM = v1 - v2 // Gọi v1.minus(v2)
    println(resultM)

    val resultT = v1 * 2 // Gọi v1.times(2)
    println(resultT)
}
