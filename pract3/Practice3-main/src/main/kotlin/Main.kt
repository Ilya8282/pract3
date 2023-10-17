fun main(args: Array<String>)
{
    //1
    val myage = 17
    val IsTeenager = 13 < myage && myage < 19
    //2
    val  theirAge = 30
    val isTeenager = ((13 < myage && myage < 19 )&&(13 < theirAge && theirAge< 19))
    //3
    val reader = "ilya"
    val author = "Richard Lucas"
    val auhorReder = reader < author
    //4
    val readerBeforeAuthor = ""
    //5
    val myAge2 = 17
    if (13 < myage && myage < 19)
        println("Подросток")
    else
        println("НЕ подросток")
    //7
    val counter = 0

    while(counter < 10){
        counter = x
        counter += 1
    }
    //8
     val counter = 0
     val roll = 0
    do{
        Random().nextInt(6)
        counter += 1
        println("после x $counter бросков roll равен $roll")
    }
        while (roll != 0)
    //9
    const val range = 1..10

    for (number in range) {
        val square = number * number
        println(square)
    }
    //10
    for (i in range) {
        println(Math.sqrt(i.toDouble()))
    }
    //11
    var sum = 0
    for (row in 0 until 8){
        if (row % 2 != 0)
        {
            continue
        }
        for (column in 0 until 8){
            sum += row * column
        }
        println("Сумма всех элементов: $sum")
    }
}