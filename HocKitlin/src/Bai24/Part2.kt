package Bai24

fun main() {
    var test1 = ThamChieuThis()
    test1.diemToan = 7f
    test1.diemVan = 8f
    test1.TestCucBo(6f, 8f)

    var tongDay1 = HocParameter()
    println("Tong cua day 1 la: " + tongDay1.TinhTong(1, 2, 3, 4, 5, 6, 7))
    var tongDay2 = HocParameter()
    println("Tong cua day 2 la: " + tongDay2.TinhTong(1, 3, 5, 7, 9))
}