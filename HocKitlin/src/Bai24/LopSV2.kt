package Bai24

class LopSV2 {
    var ma:Int = 0
    var ten:String = ""
//    khai bao private
    private var diemToan:Float = 0f
//    khai bao properties
    var DiemToan:Float
    get() {return diemToan}
    set(value) {
        diemToan = value
    }
    constructor() {
        ma = 0
        ten = "No name"
    }

    constructor(m: Int, t:String) {
        ma = m
        ten = t
    }
}