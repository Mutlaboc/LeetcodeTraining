import kotlin.random.Random
data class Spell(val name: String, val power: Int)
fun main() {
    // задание 20.09.23
    when (readln()) {
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println(a*b)

        }
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val res = kotlin.math.sqrt(((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)))
            println(res)
        }
        "circle" -> {
            val a = readln().toDouble()
            val res = 3.14 * a * a
            println(res)
        }
    }

    // задание 18.09.23 ч2
    fun <T> getStringsOnly(list: List<T>): List<String> {
        var result = mutableListOf<String>()
        for (obj in list) {
            if (obj is String) result.add(obj)
        }
        val resultSec = result.toList()
        return resultSec
    }
    // задание 18.09.23
    var three = readln().split(" ")
    var frequenciesByWord = three.groupingBy { it }.eachCount()
    for (pair in frequenciesByWord) println("${pair.key} ${pair.value}")
    // задание 7
    val listTwo = readln().split(" ")

    val res = listTwo.firstOrNull {it.last() == 'm' }?.reversed()

        println(res)

    fun Int.lastDigit(): Int {
        var lastDig = this
            lastDig %= 10
        return (lastDig)
    }
    // Задание 3
    val words = listOf("ABRACADABRA", "abracadabra", "Abracadabra", "aBracadabra", "AbracadaBRA")
    println(words.sortedDescending())
    // задание 4
    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }
    println( spells.firstOrNull {it.power > 50}?: "No spell found")

    // задание 5
    var listOne = readln().split(" ")
    val listMap = listOne.groupBy { it.any() }
    println(listMap)
val list = IntArray(readln().toInt())
    for (i in list.indices) {
        list[i] = readln().toInt()
    }
    val (a, b) = readln().toList().filter { it.isDigit() }
    if (list.contains(a.digitToInt()) && list.contains(b.digitToInt())) {
        println("YES")
        return
    }
    println("NO")

    println(makeDecision())



}
fun makeDecision(): String {

    val hands = listOf<String>("Rock", "Paper", "Scissors")
    return hands[Random.nextInt(0,3)]
}

/*
    val number = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(number) {
        list.add(readln().toInt())
    }
    println(list)
    val numberToCompare = readln().toInt()
    val test = list.filter { it == numberToCompare }
    println(test)
    println(test.size)
 */

