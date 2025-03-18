package Bai21

import kotlin.random.Random

fun main() {
//    var arr1:IntArray = IntArray(5)
//    var arr2:FloatArray = FloatArray(3)
//    println(arr1::class.java.typeName)
//    for (i in arr1){
//        print("$i\t")
//    }
//    println()
//    var arr3:IntArray = intArrayOf(1, 3, 7, 1, 8)
//    for (i in arr3){
//        print("$i\t")
//    }
//    tao mang ngau nhien
//    var rd = Random
//    var arr4:IntArray = IntArray(6)
//    println(arr4.indices)
//    for (i in arr4.indices){
//        arr4[i] = rd.nextInt(101)
//    }
//    println("Cac phan tu cua mang Array 4 la: ")
//    for (i in arr4){
//        print("$i\t")
//    }
//    println()
//    println("So phan tu cua mang Array 4 la: " + arr4.size)
//
////    Phep gan mang
//    var arr5 = arrayOf(1, 2, 3, 5)
//    var arr6 = arr5
//    println("Cac phan tu cua mang Array 5 la: ")
//    for (i in arr5){
//        print("$i\t")
//    }
//    println()
//    println("Cac phan tu cua mang Array 6 la: ")
//    for (i in arr6){
//        print("$i\t")
//    }
//    arr5[1] = 100
//    println()
//    println("Cac phan tu cua mang Array 5 la: ")
//    for (i in arr5){
//        print("$i\t")
//    }
//    println()
//    println("Cac phan tu cua mang Array 6 la: ")
//    for (i in arr6){
//        print("$i\t")
//    }
//    println()
//    clone mang
    var arr7 = arrayOf(5,6, 7, 8)
    var arr8 = arr7.clone()
    for (i in arr8){
        print("$i\t")
    }
    arr8[2] = 111
    for (i in arr8){
        print("$i\t")
    }
    println()
    println(arr8[2])
    println(arr8[2])
//    sap xep giam dan
    arr8.sortDescending()
    for (i in arr8){
        print("$i\t")
    }

}