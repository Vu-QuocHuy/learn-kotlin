package Bai16

fun Thuong(a:Int, b:Int):Int
{
    if (b==0)
        throw Exception("Mau = 0 nen khong the chia")
    return a/b
}
fun main() {
    try {
        Thuong(5, 0)
    } catch (e:Exception){
        println(e.message)
    }
    println("Cau lenh phia sau")
}