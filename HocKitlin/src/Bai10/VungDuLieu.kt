package Bai10

fun main() {
    var thuNhap:Int = 0;
    print("Nhap vao thu nhap cua ban: ")
    var sThuNhap:String? = readLine()
    if (sThuNhap != null){
        thuNhap=sThuNhap.toInt()
        when(thuNhap){
            in 1..3 -> println("Thu nhap rat thap")
            in 4..7 -> println("Thu nhap thap")
            in 8..19 -> println("Thu nhap kha")
            in 20..50 -> println("Thu nhap cao")
            in 51..1000 -> println("Thu nhap rat cao")
            else -> println("Thu nhap khong hop le")
        }
    }
}