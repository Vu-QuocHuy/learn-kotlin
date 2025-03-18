package Bai20

fun main() {
    print("Hay nhap vao mot chuoi: ")
    var str:String? = readLine()
    var str2 = ""
    var str3 = ""
    if (str != null){
        var str1 = str.toCharArray()
        for (i in str1){
            if (i.isDigit())
                str2 += i
            else if (i.isLetter())
                str3 += i
        }
    }
    println("Hai chuoi thu duoc sau khi tach la: $str3 va $str2")
}