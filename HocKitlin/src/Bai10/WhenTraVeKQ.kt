package Bai10

fun main() {
    var a:Int = 101
    var check = when(a){
        in 0..100 -> false
        else -> true
    }
    println(check)

    when {
        a%2==0 -> println("$a la so chan")
        a%2!=0 -> println("$a la so le")
    }
}