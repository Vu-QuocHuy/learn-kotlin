package Bai18

import kotlin.random.Random
fun kiemTra(soDaChon:Int, soCanDoan:Int):Boolean
{
    if (soDaChon==soCanDoan){
        println("Ban da doan dung, so can tim la: $soCanDoan")
        return true
    }
    else if (soDaChon < soCanDoan){
        println("So ban chon nho hon so can doan")
        return false
    }
    else{
        println("So ban chon lon hon so can doan")
        return false
    }
}

fun troChoi()
{
    var rd = Random
    var soCanDoan = rd.nextInt(0, 100)
    var luotDoan = 7
    while (true){
        var soChon:Int = 0
        print("Hay chon lai mot so trong khoang 1-99(ban con $luotDoan): ")
        luotDoan--
        var sSoChon:String? = readLine()
        if (sSoChon!=null){
            soChon = sSoChon.toInt()
            if (kiemTra(soChon, soCanDoan)){
                break
            } else if (luotDoan == 0){
                println("Ban da het luot doan")
            }
        }
    }
}

fun main() {
    while (true){
        troChoi()
        print("Ban co muon choi tiep khong (y/n): ")
        var tiepTuc:String? = readLine()
        if (tiepTuc!=null){
            if (tiepTuc == "y"){
                troChoi()
            } else if (tiepTuc == "n"){
                break
            } else {
                println("Ban chon khong dung, tro choi se ket thuc")
            }
        }
    }
}