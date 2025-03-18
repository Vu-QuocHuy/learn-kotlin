package Bai23

import java.util.Random
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Moi nhap vao kich thuoc cua danh sach: ")
    var n:Int = scanner.nextInt()
    var rd = Random()
    var list:MutableList<Int> = mutableListOf()
    for (i in 0 until n){
        list.add(rd.nextInt(101))
    }
    println(list)
}