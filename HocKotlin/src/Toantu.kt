fun main() {
    var a = 3
    var b = 3

//    So sanh bang
    println(a.equals(b))
//    So sanh khac
    println(!a.equals(b))
/*   dung compareTo: ket qua ra am neu a < b
                    ket qua ra bang 0 neu a bang b
                    ket qua ra duong neu a > b*/
    println(a.compareTo(b))

    var i = 100
    println((i>0).and(i<101))
    println((i>0).or(i<10))
    println((i>0).not())

    println(i.inc())//tuong tu ++
    println(i.dec())//tuong tu --
}