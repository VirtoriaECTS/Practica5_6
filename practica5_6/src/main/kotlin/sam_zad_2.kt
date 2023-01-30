fun main (){
    println("Введите число")
    var x: Int = readLine()!!.toInt()
    if(x > 99 || x < 10) println("Необходимо ввести двухзначное число")
    else{
        var one: Int = x / 10
        var two: Int = x % 10

        when(one){
            3 -> println("Есть тройка")
            6 -> println("есть шесть")
            9 -> println("есть девять")
        }
        when(two){
            3 -> println("Есть тройка")
            6 -> println("есть шесть")
            9 -> println("есть девять")
        }
    }


}