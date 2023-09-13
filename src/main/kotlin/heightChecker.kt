
fun main(args: Array<String>) {
    fun heightChecker(heights: Array<Int>): Int {
    var sortedHeights = heights.sorted()
    var count = 0
        for (i in heights.indices){
            if (heights[i] != sortedHeights[i]) count++
        }


        return count

    }
    var test = arrayOf(1,1,4,2,1,3)
    heightChecker(test)
}