package Bai23

fun main() {
    var list:MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var dem = 0
    var list1:MutableList<Int> = mutableListOf()
    for (i in list.indices) {
        if (list[i] < 5 ) {
            dem++
            list1.add(i)
        }
    }
    println("So phan tu co gia tri nho hon 5 la: $dem")
    println("Vi tri cua cac phan tu co gia tri nho hon 5 trong danh sach la:")
    println(list1)

}