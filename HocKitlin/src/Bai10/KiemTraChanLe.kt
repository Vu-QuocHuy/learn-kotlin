package Bai10

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Nhap vao so can kiem tra: ")
    var i:Int = scanner.nextInt()
    when(i%2){
        0-> println("So $i la so chan")
        else-> println("So $i la so le")
    }
}