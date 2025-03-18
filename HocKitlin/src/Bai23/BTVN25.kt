package Bai23

fun main() {
    var list:MutableList<Int> = mutableListOf(65, 12, 67, 98, 17, 6, 32)
    var list1:MutableList<Int> = mutableListOf()
    for (i in list.indices){
        list1.add(list[i]*list[i])
    }
    println(list1)
    var dem = 0;
    for (i in list.indices) {
        if (list[i] > 50){
            dem++;
        }
    }
    println("Danh sach list co $dem phan tu co gia tri lon hon 50")
}