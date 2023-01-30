fun main (){
    println("Введите число a")
    var x: Double = readLine()!!.toDouble()
    var rez:Double

    when{
        (x == -6.0) -> println("На ноль делить нельзя")
        (x<= 1) ->{
            rez = 0.0
            println("$rez")
        }

        else -> {
            rez = 1 / (x + 6)
            println("$rez")
        }
    }

}