package Bai17

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.SimpleTimeZone

fun main() {
    var cal = Calendar.getInstance()
    println(cal)
//    cach get ngay thang nam hien tai
//    var nam = cal.get(Calendar.YEAR)
//    var thang = cal.get(Calendar.MONTH)
//    var ngay = cal.get(Calendar.DAY_OF_MONTH)
//    println("ngay thang nam hien tai = $ngay/${thang+1}/$nam")

//    cach set ngay thang nam tuy y
    cal.set(Calendar.YEAR, 1999)
    cal.set(Calendar.MONTH, 6)
    cal.set(Calendar.DAY_OF_MONTH, 19)
//    kiem tra sau khi thay doi
    var namSet = cal.get(Calendar.YEAR)
    var thangSet = cal.get(Calendar.MONTH)
    var ngaySet = cal.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam sau khi set = $ngaySet/$thangSet/$namSet")

//    xuat theo dinh dang ngay/thang/nam
    var date = cal.time
    var dinhDang = SimpleDateFormat("dd/MM/yyyy")
    println(dinhDang.format(date))

//    xuat theo dinh dang Ngay/Thang/Nam, gio phut giay
    var dinhDang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(dinhDang2.format(date))

}