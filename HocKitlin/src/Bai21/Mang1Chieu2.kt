package Bai21

fun main() {
    var arr = arrayOf(1, 3, 5, 2, 8, 10)
//    trich loc mang theo dieu kien => tra ve 1 ArrayList
    var ds = arr.filter { i -> i%2 == 0 }
    println(ds) 
}