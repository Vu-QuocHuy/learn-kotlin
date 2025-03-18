package Bai24

class ThamChieuThis {
    var diemVan:Float = 0f
    var diemToan:Float = 0f

    fun TestCucBo(diemVan:Float, diemToan:Float) {
        println("Tong diem trong bien cuc bo: " + (diemVan+diemToan))
        println("Tong diem trong bien the hien: " + (this.diemVan+this.diemToan))
    }
}