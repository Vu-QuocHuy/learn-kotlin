package Bai11
//For Close Range khac voi For Step Range la buoc nhay mac dinh la 1
fun main() {
    for(i in 1..10){
        for (j in 1..10) {
            print(String.format("%2d * %2d = %3d\t", i, j, i*j))
        }
        println()
    }
}
