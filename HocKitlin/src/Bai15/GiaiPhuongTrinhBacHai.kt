package Bai15

import kotlin.math.pow
import kotlin.math.sqrt

fun GiaiPTBac2(a:Double, b:Double, c:Double):String
{
    if (a==0.0){
        if(b==0.0){
            if (c==0.0){
                return "Phuong trinh vo so nghiem"
            } else
                return "Phuong trinh vo nghiem"
        } else
            return "Phuong trinh co nghiem x = ${-c/b}"
    } else {
        var delta:Double = (b*b) - (4*a*c)
        if (delta < 0)
            return "Phuong trinh vo nghiem"
        else if (delta == 0.0) {
            var x = -b/(2*a)
            return "Phuong trinh co nghiem kep la $x"
        } else {
            var x1 = (-b + sqrt(delta))/(2*a)
            var x2 = (-b - sqrt(delta))/(2*a)
            return "Phuong trinh co 2 nghiem phan biet la x1 = $x1 va x2 = $x2"
        }
    }
}

fun main() {
    println("Moi nhap vao he so a: ")
    var a:Double? = readLine()?.toDouble()
    println("Moi nhap vao he so b: ")
    var b:Double? = readLine()?.toDouble()
    println("Moi nhap vao he so c: ")
    var c:Double? = readLine()?.toDouble()
    if (a!=null && b!=null && c!=null){
        var ketQua:String = GiaiPTBac2(a, b, c)
        println(ketQua)
    }
}