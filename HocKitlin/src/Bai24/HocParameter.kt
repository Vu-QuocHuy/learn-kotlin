package Bai24

class HocParameter {
    fun TinhTong(vararg dsSo:Int):Int {
        var tong = 0
        for (i in dsSo) {
            tong += i
        }
        return tong
    }
}