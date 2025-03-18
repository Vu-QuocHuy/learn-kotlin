fun main() {
    /*Phải sử dụng to để chuyển từ kiểu dữ liệu này sang kiểu dữ liệu khác
    Nếu chuyển từ kiểu dữ liệu bé sang lớn thì k gây mất dữ liệu
    Nếu chuyển từ kiểu dữ liệu lớn sang bé thì có thể gây mất dữ liệu*/
    var soA:Int = 35
    var soB:Long = soA.toLong()
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)
    println(soA)
    println(soB)

    //Ep kieu hep
    var x:Short = 32767
    var y:Byte = x.toByte()
    println("x = $x")
    println("y = $y")

    var diemToan:Float = 9.5f
    var diemVan:Int = diemToan.toInt()
    println("Diem Toan: $diemToan")
    println("Diem Van: $diemVan")
}