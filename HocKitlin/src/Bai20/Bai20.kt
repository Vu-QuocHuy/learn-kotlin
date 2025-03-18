package Bai20

fun main() {
    var mma = "abcdefghijklmnopqrstuvwxyz"
    var arrMHA = mma.toCharArray()
    var mmb = "zxcvbnmasdfghjklqwertyuiop"
    var arrMHB = mmb.toCharArray()
    print("Hay nhap vao chuoi can ma hoa: ")
    var str:String? = readLine()
    var strMH = ""
    if (str != null){
        var arr = str.toCharArray()
        for (i in arr){
            strMH += arrMHB.get(mma.indexOf(i))
        }
    }
    println("Chuoi sau khi ma hoa la: " + strMH)
}