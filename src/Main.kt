fun main() {
    //Задача 1
    val t1num = 3
    println("Ответ к задаче 1: ${if (t1num >= 0) t1num + 1 else t1num}")

    //Задача 2
    val t2num1 = 4
    val t2num2 = 45
    val t2num3 = -2
    val t2num4 = 8
    var countPositive = 0
    if (t2num1 >= 0) countPositive++
    if (t2num2 >= 0) countPositive++
    if (t2num3 >= 0) countPositive++
    if (t2num4 >= 0) countPositive++
    println("Ответ к задаче 2: $countPositive")

    //Задача 3
    val num1 = 6
    val num2 = 4
    println("Ответ к задаче 3: ${if (num1 > num2) num1 else num2}")

    //Задача 4
    val day = 3
    println("Ответ к задаче 4: ${
        if (day == 1) {
           "Понедельник" 
        } else if (day == 2) {
            "Вторник"
        } else if (day == 3) {
            "Среда"
        } else if (day == 4) {
            "Четверг"
        } else if (day == 5) {
            "Пятница"
        } else if (day == 6) {
            "Суббота"
        } else {
            "Воскресенье"
        }
    }")

    //Задача 5
    val k = 5
    println("Ответ к задаче 5: ${
        if (k == 1) {
            "Плохо"
        } else if (k == 2) {
            "Не удовлетворительно"
        } else if (k == 3) {
            "Удовлетворительно"
        } else if (k == 4) {
            "Хорошо"
        } else "Отлично"
    }")

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