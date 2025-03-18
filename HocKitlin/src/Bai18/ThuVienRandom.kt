package Bai18

import kotlin.random.Random

fun main() {
    var random = Random

    var rdSo = random.nextInt(10)
    println(rdSo)

    var rdDoan = random.nextInt(-5, 5)
    println(rdDoan)
//  random so thuc nam trong khoang 0 den 1
    var rdSoThuc1 = random.nextDouble()
    println(rdSoThuc1)
//    random so thuc lon hon 1
//    Cach 1: ghep random so nguyen va so thuc de tao
    var rdNguyen = random.nextInt(-10,10)
    var rdThuc = random.nextDouble()
    var soThuc = rdNguyen + rdThuc
    println(soThuc)
//    Cach 2
    var rdSoThuc = random.nextDouble()*100
    println(rdSoThuc)
}