package Bai20

fun main() {
//  nối chuỗi sử dụng StringBuilder
    var s = StringBuilder("abc12345")
    s.insert(3, "danghoc")
    println(s)

    var s1 = StringBuilder("day la dong")
    s1.append(" thu hai")
    println(s1)

    var s2 = StringBuilder("abcd0123456")
    s2.delete(0,4)
    println(s2)

    var s3 = StringBuilder("123456789")
    s3.reverse()
    println(s3)

//    tach chuoi tra va mang
    var s4 = "day la mang gan vao phan tu s4"
    var arr:List<String> = s4.split(" ")
    for (i in arr){
        println(i)
    }

//    tach chuoi thanh mang ky tu
    var s5 = "mothai"
    var arr1 = s5.toCharArray()
    for (i in arr1){
        println(i)
    }
}