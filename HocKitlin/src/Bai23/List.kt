package Bai23

fun main() {
//    Khai bao List va MutableList
    var list1:MutableList<Int> = mutableListOf()
    println(list1::class.java.typeName)
    println(list1)
    var list2:List<Int> = listOf()
    println(list2::class.java.typeName)
    println(list2)
//    Khoi tao list
    var list3:MutableList<Int> = mutableListOf(1, 3, 5, 7, 9)
    println(list3)
    var list4:List<Int> = listOf(2, 4, 6, 8)
    println(list4)
//    Duyet list
    for(i in list3.indices) {
        print("${list3[i]}\t")
    }
    println()
}