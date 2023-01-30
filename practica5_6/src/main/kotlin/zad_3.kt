fun main (){
    println("Введите возраст")
    var age: Int = readLine()!!.toInt()
    when(age){
        in 0..12 -> println("Дество")
        in 13..18 -> println("Подстростковый возраст")
        in 18..35 -> println("Молодость")
        in 35..60 -> println("Зрелость")
        in 60..80 -> println("Пожилой возраст")
        else -> println("Вы ввели неверный возраст")
    }
}