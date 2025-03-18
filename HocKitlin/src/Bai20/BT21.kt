package Bai20

fun main() {
    var a = """
        toi cham hoc
        toi chiu kho
        toi dep trai
    """.trimIndent()
    var soTu = 0
    var lst = a.split(" ")
    for (i in lst){
        if (i.contains("toi"))
            soTu++
    }
    println("So tu \"toi\" trong doan chuoi ki tu tren la: $soTu")
}