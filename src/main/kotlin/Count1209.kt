import kotlin.random.Random
data class Spell(val name: String, val power: Int)
fun main() {
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

