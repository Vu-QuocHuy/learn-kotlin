package Bai24

import java.lang.reflect.Method

class InnerClass {
    var b = 1
    inner class Children {
        fun Method() {
            println("Day la lop con, va day la gia tri cua bien b: $b")
        }
    }
    fun Method() {
        println("Day la lop cha, va day la gia tri cua bien b: $b")
    }
}