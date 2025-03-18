package Bai9

fun main() {
    var tong:Float = 0.0f
    var hieu:Float = 0.0f
    print("Nhap vao tong cua hai so: ")
    var sTong:String? = readLine()
    print("Nha vao hieu cua hai so: ")
    var sHieu:String? = readLine()
    if (sTong != null && sHieu!=null){
        tong = sTong.toFloat()
        hieu = sHieu.toFloat()
        var x:Float = (tong + hieu) / 2
        var y:Float = tong - x
        println("Gia tri x can tim la: $x")
        println("Gia tri y can tim la: $y")
    }
}