package Bai15

fun TinhTong(a:Int, b:Int, c:Int):Int{
    return a+b+c
}

fun XinChao(){
    println("Xin chao moi nguoi, toi la Huy")
}
fun main() {
     var tong = TinhTong(1, 2, 3)
    println(tong)
    XinChao()
}