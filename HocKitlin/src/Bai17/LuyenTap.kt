package Bai17

import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println("Moi nhap vao ngay thang nam sinh (dd/MM/yyyy): ")
    var s = readLine()
    if (s==null) return
    var dateInput = dinhDang.parse(s)
    var timeNamSinh = Calendar.getInstance()
//    println(timeNamSinh)
    timeNamSinh.time = dateInput
    var namSinh = timeNamSinh.get(Calendar.YEAR)
    var thangSinh = timeNamSinh.get(Calendar.MONTH)
    var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam sinh la: $ngaySinh/${thangSinh+1}/$namSinh")

    var timeHienTai = Calendar.getInstance()
    var nam = timeNamSinh.get(Calendar.YEAR)
    var tuoi = nam - namSinh
    println("Tuoi hien tai cua ban la: $tuoi")

}