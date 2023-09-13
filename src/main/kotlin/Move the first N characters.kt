import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var text = scan.nextLine()

    var number = scan.nextInt()

    println("Symbol # $number of the string \"$text\" is \'${text[number-1]}\'")


}