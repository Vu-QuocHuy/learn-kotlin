package Bai9

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Nha vao thang can kiem tra: ")
    var thang:Int = scanner.nextInt()
    if (thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang == 10 || thang==11) {
        println("Thang $thang co 31 ngay")
    }else if(thang==4 || thang==6 || thang==9 || thang==11) {
        println("Thang $thang co 30 ngay")
    }else if(thang==2){
        print("Hay nhap nam: ")
        var nam:Int = scanner.nextInt()
        if (nam%4==0 || (nam%4==0 && nam%100!=0))
            println("Thang $thang co 29 ngay")
        else
            println("Thang $thang co 28 ngay")
    } else
        println("Thang nhap vao khong hop le!")
}