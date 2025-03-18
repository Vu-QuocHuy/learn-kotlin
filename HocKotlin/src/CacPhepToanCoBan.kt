fun main() {
    /*var a = 10
    var b = 6
    println("cach 1: a + b = " + (a+b))
    println("cach 2: a + b = " + a.plus(b))
    //Tru
    println("cach 1: a - b = " + (a-b))
    println("cach 2: a - b = " + a.minus(b))
    //Nhan
    println("cach 1: a * b = " + (a*b))
    println("cach 2: a * b = " + a.times(b))
    //Chia
    println("cach 1: a / b = " + (a.toFloat()/b))
    println("cach 2: a / b = " + a.toFloat().div(b))
    //Chia du
    println("cach 1: a % b = " + (a%b))
    println("cach 2: a % b = " + a.rem(b))*/
    var i1 = 2
    var i2 = 5
    var i3 = -3
    var d1:Float = 2.0f
    var d2:Float = 5.0f
    var d3:Float = -0.5f
    println("Cau a: i1 + (i2 * i3) = " + (i1 + (i2 * i3)))
    println("Cau b: i1 * (i2 + i3) = " + (i1 * (i2 + i3)))
    println("Cau c: i1 / (i2 + i3) = " + (i1.toFloat() / (i2 + i3)))
    println("Cau e: i1 / i2 + i3 = " + (i1.toFloat() / i2 + i3))
    println("Cau d: 3 + 4 + 5 / 3 = " + (3 + 4 + (5.toFloat() / 3)))
    println("Cau i: : (3 + 4 + 5) / 3 = " + ((3 + 4 + 5) / 3))
    println("Cau k: d1 + (d2*d3) = " + (d1 + (d2*d3)))
    println("Cau l: d1 + d2 * d3 = " + (d1 + d2 * d3))
    println("Cau m: d1 / d2 - d3 = " + (d1 / d2 - d3))
    println("Cau n: d1 / (d2 - d3) = " + (d1 / (d2 - d3)))
    println("Cau o: d1 + d2 + d3 / 3 = " + (d1 + d2 + d3 / 3))
    println("Cau p: (d1 + d2 + d3) / 3 = " + ((d1 + d2 + d3) / 3))
    println("Cau q: d1 + d2 + (d3 / 3) = " + (d1 + d2 + (d3 / 3)))
    println("Cau r: 3 * (d1 + d2)*(d1-d3) = " + (3 * (d1 + d2)*(d1-d3)))

    var x:Float = 9.2f
    //tru mot ngoi (dao dau)
    var y = x.unaryMinus()
    println("x = " + x)
    println("y = " + y)
    //cong mot ngoi
    var z = x.unaryPlus()
    println("z = " + z)
}