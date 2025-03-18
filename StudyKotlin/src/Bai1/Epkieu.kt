package Bai1

fun main() {
    /*Phải sử dụng to để chuyển từ kiểu dữ liệu này sang kiểu dữ liệu khác
    Nếu chuyển từ kiểu dữ liệu bé sang lớn thì k gây mất dữ liệu
    Nếu chuyển từ kiểu dữ liệu lớn sang bé thì có thể gây mất dữ liệu*/
    var soA:Int = 35
    var soB:Long = soA.toLong()
    println(soB)
}
