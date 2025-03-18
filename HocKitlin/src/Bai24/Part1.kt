package Bai24

fun main() {
    var sv1:SinhVien = SinhVien(101, "Hung", "033204008761")
    var sp1 = SanPham()
    var sp2 = SanPham(1, "Tivi", 1000)
    var lop = LopSV2()
    var lop1 = LopSV2(1, "Lop CT7A")
    println("Thong tin lop: ${lop.ma} - ${lop.ten}")
    println("Thong tin lop: ${lop1.ma} - ${lop1.ten}")
    lop.DiemToan = 9f

}