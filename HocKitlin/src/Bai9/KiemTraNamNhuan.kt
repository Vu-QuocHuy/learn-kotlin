package Bai9

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Nhap nam ma ban muon kiem tra: ")
    var nam:Int = scanner.nextInt()
    if (nam%400 == 0 || (nam%4==0 && nam % 100 != 0))
    {
        println("Nam $nam la nam nhuan")
    } else
        println("Nam $nam khong phai la nam nhuan")

}