package problems.easy

fun saveThePrisoner(prisoners: Int, sweets: Int, start: Int): Int {
    val reminder = sweets % prisoners
    val res = (reminder + start - 1) % prisoners

    return if (res == 0)
        prisoners
    else
        res
}

fun main() {
    println(saveThePrisoner(5, 2, 1))
    println(saveThePrisoner(5, 2, 2))
    println(saveThePrisoner(7, 19, 2))
    println(saveThePrisoner(3, 7, 3))
    println(saveThePrisoner(499999999, 999999997, 2))
    println(saveThePrisoner(499999999, 999999998, 2))
    println(saveThePrisoner(999999999, 999999999, 1))
}