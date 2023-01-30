fun main (){
    println("Введите число")
    var a: Int = readLine()!!.toInt()
    when(a){
        0 -> println("Ноль")
        1 -> println("Один")
        2 -> println("Два")
        3 -> println("Три")
        4 -> println("Четыре")
        5 -> println("Пять")
        6 -> println("Щесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
        else ->("Вы ввели не однозначное число, либо отрицательное число")

    }
}