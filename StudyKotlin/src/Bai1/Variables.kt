@file:JvmName("VariablesKt")

package Bai1

fun main() {
    //Sử dụng val để khai báo biến có giá trị cố định(hằng số)
    val PI = 3.14f
    println(PI)
    //Sử dụng var để khai báo biến có giá trị không cố định, có thể thay đổi được
    var one = 1
    var ten = 10
    println(one)
    println(ten)
    println("There are PI = $PI")
    println("There are number $one and $ten")
    var check = true
    var check2 = false
   /* Cách khai báo/khởi tạo biến: var tên_biến : kiểu dữ liệu = giá trị
    Nếu gán giá trị thì là khởi tạo biến, nếu không gán giá trị thì là khai báo biến*/
    var a = 123
    println("$a")
    var y:Double = 9.5
    var z = 4.8
    println("kieu du lieu cua y la: ${y::class.simpleName}")
    println("kieu du lieu cua z la: ${z::class.simpleName}")

    var k:Float = 7.5f
    var h = 4.7f
    println("kieu du lieu cua k la: ${k::class.simpleName}")
    println("kieu du lieu cua h la: ${h::class.simpleName}")

    var so_Long:Long = 123456789L
    println("kieu du lieu cua so_Long la: ${so_Long::class.simpleName}")

    var kitu:Char = 'a'
    var str1:String = "Hom nay troi that dep"
    var str2:String = "b"
//    Khai bao doan
    var str3 = """
       Mot hai ba
       Ba bon nam
       Sau bay tam
    """
    println(str3)

//    khai bao kieu mang
//    var ten_mang : TypeArray = typeArrayOf(cac gia tri)
    var mangSoNguyen : IntArray = intArrayOf(1, 2, 3)
    var mangKiTu : CharArray = charArrayOf('a','b','c','d','e')
}
