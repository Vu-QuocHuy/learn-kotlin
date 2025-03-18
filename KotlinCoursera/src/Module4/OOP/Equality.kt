package Module4.OOP

data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

fun equals2(v1: Value?, v2: Value?): Boolean {
    if(v1 === v2)
        return true
    if (v1 == null || v2 == null)
        return false
    return v1.equals(v2)
}

fun main(args: Array<String>) {
    equals1(Value("abc"), Value("abc"))
    equals1(Value("abc"), null)
    equals1(null, Value("abc"))
    equals1(null, null)

    equals2(Value("abc"), Value("abc"))
    equals2(Value("abc"), null)
    equals2(null, Value("abc"))
    equals2(null, null)
}