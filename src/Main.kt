fun main() {
    //Задача 1
    val number = 3
    println("Ответ к задаче 1: ${if (number >= 0) number + 1 else number}")
    //Задача 2
    val list = listOf(4, 45, -2, 8)
    var countPositive = 0
    for (i in list) {
        if (i >= 0) countPositive++
    }
    println("Ответ к задаче 2: $countPositive")
    //Задача 3
    val num1 = 6
    val num2 = 4
    println("Ответ к задаче 3: ${if (num1 > num2) num1 else num2}")
    //Задача 4
    val day = 3
    val daysOfWeek = listOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    for (i in daysOfWeek) {
        if (daysOfWeek[day] == i) println("Ответ к задаче 4: $i")
    }
    //Задача 5
    val k = 5
    val marksList = listOf("Плохо", "Не удовлетворительно", "Удовлетворительно", "Хорошо", "Отлично")
    println("Ответ к задаче 5: ${if (k in 1..marksList.size) {
        marksList[k - 1]
    } else {
        "Ошибка"
    }}")
    //Задача 6
    val action = 1
    val doubleNum1 = 2.0
    val doubleNum2 = 3.5
    println("Ответ к задаче 6: ${
        if (action == 1) { 
            doubleNum1 + doubleNum2
        } else if (action == 2) {
            doubleNum1 - doubleNum2
        } else if (action == 3) {
            doubleNum1 * doubleNum2
        } else {
            doubleNum1 / doubleNum2
        }
    }")
}