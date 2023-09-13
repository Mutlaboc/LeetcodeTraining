fun main() {
    val comp = IntArray(readln().toInt()) {readln().toInt()}
    val tax = IntArray(comp.size) {readln().toInt()}
    var company = 0
    var taxes = 0
    for (i in comp.indices) {
        println("налог компании $i ${comp[i]*tax[i]}")
        if (taxes < (comp[i]*tax[i])) {
            println("налог компании $i ${comp[i]*tax[i]}")
            company = i
            taxes = (comp[i]*tax[i])
        }
    }
    println(company)

    fun getVolume(length: Int, width: Int = 1, height: Int = 1) :Int {
        return length*width*height
    }


}