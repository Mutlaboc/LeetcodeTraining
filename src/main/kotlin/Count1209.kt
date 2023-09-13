fun main() {
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
}