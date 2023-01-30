fun main () {
    println("Введите x")
    var x: Double = readLine()!!.toDouble()
    println("Введите y")
    var y: Double = readLine()!!.toDouble()
    println("Введите диаметр форточки")
    var d: Double = readLine()!!.toDouble()
    if(x <= 0 || y <= 0|| d <= 0) println("Введеные числа должны быть больше нуля")
    else {
        when (d > x && d > y) {
            true -> println("Эксперемент удался")
            false -> println("Федя застрял")
        }
    }
}