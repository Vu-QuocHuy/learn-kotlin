package Bai20

fun main() {
    var str1 = "English=78 Science=83 Math=68 History=65"
    var arr:List<String> = str1.split(" ")
    str1 = "English=78 Science=83 Math=68 History=65"
    var sum = 0
    for (i in arr) {
        var so = i.substring(i.length-2).toInt()
        sum += so
    }
    println(sum)
    println(sum/arr.size.toFloat())


}