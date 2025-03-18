package Module3.Nullability

fun String?.isEmptyOrNull(): Boolean {
    if (this.isNullOrEmpty())
        return true
    return false
}

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isEmptyOrNull())
    println(s2.isEmptyOrNull())
    val s3 = "   "
    println(s3.isEmptyOrNull())
}