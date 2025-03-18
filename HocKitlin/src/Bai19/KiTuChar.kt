package Bai19

fun main() {
    var kyTu:Char = 'a'
    println(kyTu)
    println(kyTu::class.java.typeName)

    var kyTu2 = Char(64)
    println(kyTu2)
    println(kyTu2::class.java.typeName)
//    chuyen mot ki tu kieu String sang kieu Char
    var s:String? = readLine()
    if (s!=null){
        var kt1:Char = s.first()
        var kt2:Char = s[0]
        var kt3:Char = s.single()
        println(kt1)
        println(kt2)
        println(kt3)
        println(kt1::class.java.typeName)
        println(kt2::class.java.typeName)
        println(kt3::class.java.typeName)
    }

//    dung compareTo, Equals de so sanh
    println('A'.compareTo('A'))
    println('a'.equals('b'))
}