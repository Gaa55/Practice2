fun main(args: Array<String>) {

    // Задача 1:
    val age1: Int = 42
    val age2: Int = 21

// Задача 2:
    val avg1: Double = (age1 + age2) / 2.0

// Задача 4:
    val firstName: String = "Иван"
    val lastName: String = "Иванов"

// Задача 5:
    val fullName: String = "$firstName"+ "$lastName"

// Задача 6:
    val myDetails: String = "Привет, меня зовут $fullName."

// Задача 7:
    val date: Triple<Int, Int, Int> = Triple(9, 14, 2023)

// Задача 8:
    val (month, day, year) = date

// Задача 9:
    val (extractedMonth, extractedYear) = date

// Задача 10:
    val updatedMonth = 10
    val updatedDate: Pair<Int, Int> = Pair(updatedMonth, extractedYear)
    println()
}