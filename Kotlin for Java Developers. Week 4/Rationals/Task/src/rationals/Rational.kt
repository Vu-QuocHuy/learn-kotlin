package rationals

import java.math.BigInteger

class Rational(n: BigInteger, d: BigInteger) : Comparable<Rational> {
    val numerator: BigInteger
    val denominator: BigInteger

    init {
        require(d != BigInteger.ZERO) { "Denominator cannot be zero" }

        // Tìm GCD để rút gọn phân số
        val gcd = n.gcd(d)
        var num = n / gcd
        var den = d / gcd

        // Mẫu số luôn dương, nếu âm thì chuyển dấu lên tử số
        if (den < BigInteger.ZERO) {
            num = -num
            den = -den
        }

        numerator = num
        denominator = den
    }

    override fun toString(): String {
        return if (denominator == BigInteger.ONE) {
            "$numerator"
        } else {
            "$numerator/$denominator"
        }
    }

    // Toán tử cộng hai số hữu tỉ
    operator fun plus(other: Rational): Rational {
        val newNumerator = numerator * other.denominator + other.numerator * denominator
        val newDenominator = denominator * other.denominator
        return Rational(newNumerator, newDenominator)
    }

    // Toán tử trừ hai số hữu tỉ
    operator fun minus(other: Rational): Rational {
        val newNumerator = numerator * other.denominator - other.numerator * denominator
        val newDenominator = denominator * other.denominator
        return Rational(newNumerator, newDenominator)
    }

    // Toán tử nhân hai số hữu tỉ
    operator fun times(other: Rational): Rational {
        return Rational(numerator * other.numerator, denominator * other.denominator)
    }

    // Toán tử chia hai số hữu tỉ
    operator fun div(other: Rational): Rational {
        return Rational(numerator * other.denominator, denominator * other.numerator)
    }

    // Toán tử đổi dấu
    operator fun unaryMinus(): Rational {
        return Rational(-numerator, denominator)
    }

    // So sánh hai số hữu tỉ
    override fun compareTo(other: Rational): Int {
        return (numerator * other.denominator).compareTo(other.numerator * denominator)
    }

    // Kiểm tra phạm vi (a in b..c)
    operator fun rangeTo(other: Rational): ClosedRange<Rational> = RationalRange(this, other)

    private class RationalRange(override val start: Rational, override val endInclusive: Rational) : ClosedRange<Rational>

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rational) return false
        return numerator == other.numerator && denominator == other.denominator
    }

    override fun hashCode(): Int {
        return numerator.hashCode() * 31 + denominator.hashCode()
    }
}

// Hàm mở rộng để tạo số hữu tỉ từ `String`
fun String.toRational(): Rational {
    val parts = this.split("/")
    return when (parts.size) {
        1 -> Rational(parts[0].toBigInteger(), BigInteger.ONE)
        2 -> Rational(parts[0].toBigInteger(), parts[1].toBigInteger())
        else -> throw IllegalArgumentException("Invalid rational number format")
    }
}

// Toán tử `divBy` để tạo số hữu tỉ
infix fun Int.divBy(den: Int) = Rational(this.toBigInteger(), den.toBigInteger())
infix fun Long.divBy(den: Long) = Rational(this.toBigInteger(), den.toBigInteger())
infix fun BigInteger.divBy(den: BigInteger) = Rational(this, den)

fun main() {
    val half = 1 divBy 2
    val third = 1 divBy 3

    val sum: Rational = half + third
    println(5 divBy 6 == sum)

    val difference: Rational = half - third
    println(1 divBy 6 == difference)

    val product: Rational = half * third
    println(1 divBy 6 == product)

    val quotient: Rational = half / third
    println(3 divBy 2 == quotient)

    val negation: Rational = -half
    println(-1 divBy 2 == negation)

    println((2 divBy 1).toString() == "2")
    println((-2 divBy 4).toString() == "-1/2")
    println("117/1098".toRational().toString() == "13/122")

    val twoThirds = 2 divBy 3
    println(half < twoThirds)

    println(half in third..twoThirds)

    println(2000000000L divBy 4000000000L == 1 divBy 2)

    println("912016490186296920119201192141970416029".toBigInteger() divBy
            "1824032980372593840238402384283940832058".toBigInteger() == 1 divBy 2)
}