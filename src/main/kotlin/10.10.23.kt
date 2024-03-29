fun main() {

    fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
        var summ = 0
        for (item in shoppingList) {
            summ += priceList[item]?:0
        }
        return summ
    }

    fun main() {
        val list = readln().split(" ")
        // write your code here
        val res = list.reversed()


            println(res)
    }

    val lambda: (Long, Long) -> Long = { x, y -> (x..y).reduce { c, z -> c * z } }


// complete the definition

    infix fun List<Ship>.battle(ammunitionLimit: Int): List<String> {
        val list = this.filter { it.ammunition < ammunitionLimit }
        return list.map { it.name }
    }


}
data class Ship(val name: String, val ammunition: Int)