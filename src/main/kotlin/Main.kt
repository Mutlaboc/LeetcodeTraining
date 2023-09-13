fun main(args: Array<String>) {
fun parseCardNumber(cardNumber: String): Long {
    var regex = Regex("\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}")
    return if (regex.matches(cardNumber)) cardNumber.filter { !it.isWhitespace() }.toLong()
    else throw Exception("the card number is incorrect.")

}
    fun checkHeight(iterator: Iterator<Int>) {
        while (iterator.hasNext()) {
            if (iterator.next() in 145..210) println("You can go!") else println("Sorry, not today")
        }
    }
    val density = readln().toDouble()
    val height = readln().toDouble()
    val gravityConst = 9.8
    println(density*height*gravityConst)

    val text = "sdgdtncbvcb"
    val textset = text.split("")
    println( parseCardNumber(readln()))
}