import java.util.Scanner

fun main() {
    /*Mot so phuong thuc thong dung de ep cac kieu du lieu cho String
    toBoolean(), toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()*/
    var a1:Boolean = "true".toBoolean()
    println(a1)
    println(a1::class.java.typeName)

    var a2:Byte = "2".toByte()
    println(a2)
    println(a2::class.java.typeName)

    var a3:Short = "127".toShort()
    println(a3)
    println(a3::class.java.typeName)

    println("hay nha vao mot dong: ")
    var str1:String? = readLine()
    println("Dong vua nhap la: " + str1)

//    nhap vao so nguyen
    var soA:Int
    println("Hay nhap vao mot so nguyen: ")
    var str2:String? = readLine()
    if (str2!=null){
        soA = str2.toInt()
        println(soA)
    }


    var a:Double = 0.0
    var b:Double = 0.0
    var s1:String? = readLine()

    val scanner = Scanner(System.`in`)
    var str:String = scanner.nextLine()
    println("Chuoi da nhap la: " + str)
}