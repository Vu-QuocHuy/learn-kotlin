package Module3.Nullability

fun main() {
//    var any:String = "abcd"
//    if (any is String) {
//        any.uppercase()
//    }
//    println(any)
    val s = null

    println(s as? Int)
    println(s as Int?)

}