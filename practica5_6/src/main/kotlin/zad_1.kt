fun main (){
    println("Введите число a")
    var a: Double = readLine()!!.toDouble()
    println("Введите число b")
    var b: Double = readLine()!!.toDouble()

    when{
        (a == b) -> {
            a = Math.pow(a, 3.0)
            println("Числа равные. В итоге a = $a и b равна $b")
        }
        (a > b) ->{
            a += 1
            println("Числа a больше. В итоге a = $a и b равна $b")
        }
        else ->{
            b += 1;
            println("Числа a больше. В итоге a = $a и b равна $b")
        }
    }


}