package Bai10

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Nhap thang can kiem tra: ")
    var thang:Int = scanner.nextInt()
    when(thang){
        1,2,3 -> println("Thang $thang thuoc quy I")
        4,5,6 -> println("Thang $thang thuoc quy II")
        7,8,9 -> println("Thang $thang thuoc quy III")
        10,11,12 -> println("Thang $thang thuoc quy IV")
        else -> println("Thang nhap vao khong hop le")
    }
}