package Bai9

import kotlin.math.pow

fun main() {
    var chieuCao:Float = 0.0f
    var canNang:Float = 0.0f
    println("Nhap chieu cao cua ban: ")
    var sChieuCao:String? = readLine()
    println("Nhap can nang cua ban: ")
    var sCanNang:String? = readLine()
    if (sChieuCao != null && sCanNang != null){
        chieuCao = sChieuCao.toFloat()
        canNang = sCanNang.toFloat()
        var BMI:Float = canNang / chieuCao.pow(2)
        if (BMI < 15)
            println("Than hinh qua gay")
        else if(BMI>= 15 && BMI < 16)
            println("Than hinh gay")
        else if(BMI>= 16 && BMI < 18.5)
            println("Than hinh hoi gay")
        else if(BMI>= 18.5 && BMI < 25)
            println("Than hinh binh thuong")
        else if(BMI>= 25 && BMI < 30)
            println("Than hinh hoi beo")
        else if(BMI>= 30 && BMI < 35)
            println("Than hinh beo")
        else
            println("Than hinh qua beo")
    }
}