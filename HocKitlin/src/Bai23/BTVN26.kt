package Bai23

fun main() {
    var quest: MutableList<String> = mutableListOf("2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12%2 =")
    var dapAn:MutableList<Float> = mutableListOf(14f, 50f, 4f, 0f)
     for (i in quest.indices) {
         print(quest[i] + " ")
         var input:String? = readLine()
         if (input==null)
             return
         else {
             var so = input.toFloat()
             if (so == dapAn[i])
                 println("correct")
             else
                 println("wrong, the ansewer is ${dapAn[i]}")
         }
     }
}