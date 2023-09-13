fun main(args: Array<String>) {
    fun thirdMax(nums: Array<Int>): Int {
        //if (nums.isEmpty()) return 0
        if (nums.size < 2) return nums[0]
        if (nums.size == 2) {
            nums.sortDescending()
            return nums[0]

        }
        nums.sortDescending()
        val first = nums[0]
        var count = 1
        while (nums[count] == first && count < nums.size) count++
        if (count>= nums.size) return first
        val second = nums[count]
        while (nums[count] == second && count < nums.size) count++
        if (count>= nums.size) return first
        val third = nums[count]
        return third

        /*
        val arr = arrayOf(nums[0], nums[1], nums[2])
        var first = nums[0]
        var second = 1
        var third = 2
        var thirdNotExist = true
        transactions@ for (i in nums.indices) {
            println("Проверка числа ${nums[i]}")
            when {
                (nums[i] == first) -> continue@transactions
                (nums[i] > first) -> {
                    println("смена первого числа с $first на ${nums[i]}")
                    second = first; first = nums[i]
                    continue@transactions
                }

                (nums[i] == second) -> continue@transactions
                (nums[i] in second + 1 until first) -> {
                    println("смена второго числа с $second на ${nums[i]}")
                    if (second != -2147483648) {
                    thirdNotExist = false
                    third = second}
                    second = nums[i]
                }

                (nums[i] == third) -> continue@transactions
                (nums[i] < second) -> {
                    println("${nums[i]} замена 3 числа")
                    thirdNotExist = false

                    if (third < nums[i]) third = nums[i]
                }

            }

        }
        println(" $first    $second   $third")
        println(thirdNotExist)
        if (nums.size < 3 || thirdNotExist) return first
        return third

    }
    */
    }
    var nums = arrayOf(1,1,2)

    println(thirdMax(nums))



}