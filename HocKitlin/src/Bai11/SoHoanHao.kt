package Bai11

fun main() {
    for(i in 1..1000){
        var tonguoc:Int = 0
        for(j in 1 until i){
            if (i%j==0){
                tonguoc += j
            }
        }
        if (tonguoc == i){
            println(i)
        }
    }
}