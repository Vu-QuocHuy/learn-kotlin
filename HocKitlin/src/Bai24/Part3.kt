package Bai24

import kotlin.math.E

fun main() {
    NestedClass.Children().Method()
    NestedClass().Method()

    println("----------------------")
    InnerClass().Children().Method()
    InnerClass().Method()

    println("----------------------")
    println(EnumClass.Mot.ordinal)
    println(EnumClass.Ba .ordinal)
    println(EnumClass.Bon)
    println(EnumClass.Bon.name)
//    Tra ve mang danh sach cac phan tu cua enum
    var ds = EnumClass.values()
    ds.forEach { println(it) }

    println("----------------------")
    var a:EnumClass = EnumClass.Ba
    when(a) {
        EnumClass.Mot -> println(1)
        EnumClass.Hai -> println(2)
        EnumClass.Ba -> println(3)
        EnumClass.Bon -> println(4)
        EnumClass.Nam -> println(5)
    }
    println(EnumClass.Nam.chuSo)
}