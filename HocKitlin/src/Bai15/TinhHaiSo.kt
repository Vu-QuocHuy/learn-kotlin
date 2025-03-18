package Bai15

fun PhepTinh(a:Double, b:Double, c:String):String
{
    when(c){
        "+" -> return "Ket qua = ${a+b}"
        "-" -> return "Ket qua = ${a-b}"
        "*" -> return "Ket qua = ${a*b}"
        "/" -> return "Ket qua = ${a/b}"
        else -> return "Phep toan khong hop le"
    }
}

fun main() {
    println("Moi nhap vao so a: ")
    var a:Double? = readLine()?.toDouble()
    println("Moi nhap vao so b: ")
    var b:Double? = readLine()?.toDouble()
    println("Moi nhap vao phep tinh(+, -, *, /): ")
    var c:String? = readLine()
    if (a!= null && b!=null && c!= null){
        println(PhepTinh(a,b,c))
    }

}