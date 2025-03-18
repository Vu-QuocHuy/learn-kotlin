package Bai24

fun Int.Cong(a:Int):Int {
    return this+a
}

fun Int.ktSoNT():Boolean {
    var a = this.toDouble()
    if (a < 2)
        return false
    for (i in 2..Math.sqrt(a).toInt() step 1) {
        if (a % i == 0.0)
            return false
    }
    return true
}
fun main() {
    var x = 7.Cong(5)
    println(x )
    if (2.ktSoNT())
        println("2 la so nguyen to")
}