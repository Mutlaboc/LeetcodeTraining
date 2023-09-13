class City(val name: String) {
    var degrees: Int = 0
}

/*fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = if (first in -92..57 ) first else 30
    val secondCity = City("Moscow")
    secondCity.degrees = if (second in -92..57 ) second else 5
    val thirdCity = City("Hanoi")
    thirdCity.degrees = if (third in -92..57 ) third else 20

    val cityMap = mapOf<String, Int>(
        firstCity.name to firstCity.degrees,
        secondCity.name to secondCity.degrees,
        thirdCity.name to thirdCity.degrees,
    )
    val result = cityMap.toList().sortedBy { (_, value) -> value}

    print()
}

 */
fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = if (first in -92..57 ) first else 30
    val secondCity = City("Moscow")
    secondCity.degrees = if (second in -92..57 ) second else 5
    val thirdCity = City("Hanoi")
    thirdCity.degrees = if (third in -92..57 ) third else 20
    var coldest = ""
    var secondCompare = 0
    var thirdCools = ""
    var firstTemp = 0
    var SecondTemp = 0
    println("Температуры: " +
            "${firstCity.degrees}" +
            "${secondCity.degrees}" +
            "${thirdCity.degrees}")
    if (firstCity.degrees <= secondCity.degrees) {
        coldest = "Dubai"
        firstTemp = firstCity.degrees
        SecondTemp = secondCity.degrees
        secondCompare = firstCity.degrees
    }
    else {
        coldest ="Moscow"
        thirdCools = "Dubai"
        firstTemp = secondCity.degrees
        SecondTemp = firstCity.degrees
        secondCompare = secondCity.degrees
    }

    if (secondCompare >= thirdCity.degrees) {
        thirdCools = coldest
        coldest = "Hanoi"
        SecondTemp = firstTemp
        firstTemp = thirdCity.degrees

    }

    if (SecondTemp == firstTemp) {
        println("neither")
        return
    }

    print(coldest)
}
fun isPalindrome(str: CharSequence): Boolean {
    var count = 0
    for (word in str.length-1 downTo 0) {
        if (str[word] != str[count]) {
            return false
        }
        count++
    }
    return true

}

