package Bai10

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Nhap vao mot so: ")
    var i:Int = scanner.nextInt()
    when(i){
        1-> println("So ban nhap la so 1")
        2-> println("So ban nhap la so 2")
        3-> println("So ban nhap la so 3")
        else -> println("So ban nha khong nam trong cac so 1,2,3")
    }
}