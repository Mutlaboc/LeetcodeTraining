fun main() {
// complete the definition

    infix fun List<Ship>.battle(ammunitionLimit: Int): List<String> {
        val list = this.filter { it.ammunition < ammunitionLimit }
        return list.map { it.name }
    }


}
data class Ship(val name: String, val ammunition: Int)