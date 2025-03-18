package Bai22

import kotlin.random.Random

fun main() {
    var arr:Array<IntArray> = Array(3, {IntArray(4)})
    var rd = Random
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            arr[i][j] = rd.nextInt(101)
        }
    }
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            print("${arr[i][j]}\t")
        }
        println()
    }
}