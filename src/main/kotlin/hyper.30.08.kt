fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val buff = numbers.last()
    numbers[numbers.size - 1] = numbers[0]
    numbers[0] = buff
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
    class Pet (name: String,animal: String = "cat", owner: String) {
        val name = name
        val animal = animal
        val owner = owner
    }
}