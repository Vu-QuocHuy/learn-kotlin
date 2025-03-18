package Bai20

fun main() {
    print("Hãy nhập vào một chuối: ")
    var str:String? = readLine()
    if (str != null) {
        var arr = str.toCharArray()
        var ktThuong = 0
        var ktHoa = 0
        var chuSo = 0
        var khoangTrang = 0
        for (i in arr) {
            if (i.isDigit())
                chuSo++
            else if (i.isLowerCase())
                ktThuong++
            else if (i.isUpperCase())
                ktHoa++
            else if (i.isWhitespace())
                khoangTrang++
        }
        println("Chuoi nha vao co: $chuSo chu so")
        println("Chuoi nha vao co: $ktThuong ki tu thuong")
        println("Chuoi nha vao co: $ktHoa ki tu hoa")
        println("Chuoi nha vao co: $khoangTrang khoang trang")
    }
}