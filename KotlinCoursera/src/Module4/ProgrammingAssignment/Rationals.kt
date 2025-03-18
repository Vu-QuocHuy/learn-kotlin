package Module4.ProgrammingAssignment

import java.math.BigInteger // Import thư viện hỗ trợ số nguyên lớn (BigInteger)

class Rational(n: BigInteger, d: BigInteger) : Comparable<Rational> { // Lớp biểu diễn số hữu tỉ, kế thừa Comparable để hỗ trợ so sánh
    val numerator: BigInteger // Tử số của phân số
    val denominator: BigInteger // Mẫu số của phân số

    init {
        require(d != BigInteger.ZERO) { "Denominator cannot be zero" } // Kiểm tra mẫu số khác 0, nếu không ném lỗi

        val gcd = n.gcd(d) // Tìm ước số chung lớn nhất (GCD) của tử số và mẫu số để rút gọn phân số
        var num = n / gcd // Rút gọn tử số
        var den = d / gcd // Rút gọn mẫu số

        if (den < BigInteger.ZERO) { // Đảm bảo mẫu số luôn dương
            num = -num // Nếu mẫu số âm, đổi dấu cả tử số và mẫu số
            den = -den
        }

        numerator = num // Gán giá trị tử số
        denominator = den // Gán giá trị mẫu số
    }

    override fun toString(): String {
        return if (denominator == BigInteger.ONE) { // Nếu mẫu số là 1, chỉ hiển thị tử số
            "$numerator"
        } else {
            "$numerator/$denominator" // Nếu không, hiển thị dưới dạng "n/d"
        }
    }

    operator fun plus(other: Rational): Rational { // Nạp chồng toán tử cộng
        val newNumerator = numerator * other.denominator + other.numerator * denominator // Quy đồng rồi cộng tử số
        val newDenominator = denominator * other.denominator // Nhân mẫu số để quy đồng
        return Rational(newNumerator, newDenominator) // Tạo Rational mới sau khi cộng
    }

    operator fun minus(other: Rational): Rational { // Nạp chồng toán tử trừ
        val newNumerator = numerator * other.denominator - other.numerator * denominator // Quy đồng rồi trừ tử số
        val newDenominator = denominator * other.denominator // Nhân mẫu số để quy đồng
        return Rational(newNumerator, newDenominator) // Tạo Rational mới sau khi trừ
    }

    operator fun times(other: Rational): Rational { // Nạp chồng toán tử nhân
        return Rational(numerator * other.numerator, denominator * other.denominator) // Nhân tử số với tử số, mẫu số với mẫu số
    }

    operator fun div(other: Rational): Rational { // Nạp chồng toán tử chia
        return Rational(numerator * other.denominator, denominator * other.numerator) // Nhân với phân số nghịch đảo
    }

    operator fun unaryMinus(): Rational { // Nạp chồng toán tử đổi dấu
        return Rational(-numerator, denominator) // Đảo dấu tử số
    }

    override fun compareTo(other: Rational): Int { // Nạp chồng toán tử so sánh
        return (numerator * other.denominator).compareTo(other.numerator * denominator) // Quy đồng rồi so sánh tử số
    }

    operator fun rangeTo(other: Rational): ClosedRange<Rational> = RationalRange(this, other) // Hỗ trợ toán tử "in" để kiểm tra phạm vi

    private class RationalRange(override val start: Rational, override val endInclusive: Rational) : ClosedRange<Rational> // Lớp đại diện cho khoảng giá trị của số hữu tỉ

    override fun equals(other: Any?): Boolean { // Ghi đè phương thức equals để kiểm tra hai Rational có bằng nhau không
        if (this === other) return true // Nếu cùng tham chiếu, trả về true
        if (other !is Rational) return false // Nếu không phải Rational, trả về false
        return numerator == other.numerator && denominator == other.denominator // So sánh tử số và mẫu số
    }

    override fun hashCode(): Int { // Ghi đè phương thức hashCode để dùng với HashSet, HashMap
        return numerator.hashCode() * 31 + denominator.hashCode() // Tạo hash dựa trên tử số và mẫu số
    }
}

// Chuyển đổi từ String thành Rational
fun String.toRational(): Rational {
    val parts = this.split("/") // Tách chuỗi theo dấu "/"
    return when (parts.size) {
        1 -> Rational(parts[0].toBigInteger(), BigInteger.ONE) // Nếu chỉ có một phần, giả định mẫu số là 1
        2 -> Rational(parts[0].toBigInteger(), parts[1].toBigInteger()) // Nếu có hai phần, chuyển đổi cả tử số và mẫu số
        else -> throw IllegalArgumentException("Invalid rational number format") // Nếu sai định dạng, ném lỗi
    }
}

// Định nghĩa toán tử `divBy` để tạo Rational nhanh chóng
infix fun Int.divBy(den: Int) = Rational(this.toBigInteger(), den.toBigInteger()) // Dành cho Int
infix fun Long.divBy(den: Long) = Rational(this.toBigInteger(), den.toBigInteger()) // Dành cho Long
infix fun BigInteger.divBy(den: BigInteger) = Rational(this, den) // Dành cho BigInteger

// Chương trình kiểm thử
fun main() {
    val half = 1 divBy 2 // Tạo số 1/2
    val third = 1 divBy 3 // Tạo số 1/3

    println(half + third == 5 divBy 6) // Kiểm tra cộng: 1/2 + 1/3 = 5/6
    println(half - third == 1 divBy 6) // Kiểm tra trừ: 1/2 - 1/3 = 1/6
    println(half * third == 1 divBy 6) // Kiểm tra nhân: 1/2 * 1/3 = 1/6
    println(half / third == 3 divBy 2) // Kiểm tra chia: 1/2 ÷ 1/3 = 3/2
    println(-half == -1 divBy 2) // Kiểm tra đổi dấu: -1/2

    println((2 divBy 1).toString() == "2") // Kiểm tra hiển thị dạng tối giản
    println((-2 divBy 4).toString() == "-1/2") // Kiểm tra chuẩn hóa
    println("117/1098".toRational().toString() == "13/122") // Kiểm tra chuyển đổi từ String

    val twoThirds = 2 divBy 3
    println(half < twoThirds) // Kiểm tra so sánh: 1/2 < 2/3
    println(half in third..twoThirds) // Kiểm tra phạm vi: 1/2 nằm giữa 1/3 và 2/3

    println(2000000000L divBy 4000000000L == 1 divBy 2) // Kiểm tra số lớn

    println(
        "912016490186296920119201192141970416029".toBigInteger() divBy
                "1824032980372593840238402384283940832058".toBigInteger() == 1 divBy 2
    ) // Kiểm tra với BigInteger cực lớn
}
