fun main() {
    var count = 0
    val text = readln()
    firstvave@ for (c in text.indices) {
        for (i in text.indices) {
            if (c == i) continue
            if (text[i] == text[c]) continue@firstvave
        }
        count++
    }
    println(count)
}
