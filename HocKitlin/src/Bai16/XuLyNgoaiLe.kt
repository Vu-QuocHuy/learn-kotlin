package Bai16

fun main() {
    var a=10
    var b=0
    try {
        var c = a/b
        println(c)
    } catch (e:Exception){
        e.printStackTrace()
    } finally {
        println("Dong lenh duoc in ra ke ca khi xay ra loi")
    }
    println("Doan code phia sau")
}