package Bai20

fun checkPW(str:String):Boolean
{
    var demSo = 0
    var demChu = 0
    var str1 = str.toCharArray()
    if (str.length < 6)
        return false
    else {
        for (i in str1){
            if (i.isLetter())
                demChu++
            if (i.isDigit())
                demSo++
        }
        if (demChu >=1 && demSo >= 1)
            return true
        else
            return false
    }
}

fun main() {
    var pw = "aaaaaAAAAAA1"
    var soLuot = 4
    while (soLuot>=0){
        print("Hay nhap mat khau de dang nhap: ")
        var str:String? = readLine()
        if (str != null){
            if (str.equals(pw) && checkPW(str)){
                println("Dang nhap thanh cong")
                break
            } else {
                print("Mat khau khong chinh xac")
                if (soLuot>0)
                    println(", ban con $soLuot lan nhap")
                soLuot--
            }
        }
    }
}