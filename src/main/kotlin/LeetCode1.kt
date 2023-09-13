fun main(args: Array<String>) {

        fun removeDuplicates(nums: Array<Int>): Int {
            //if (nums.isEmpty()) return 0
            if (nums.size < 2) return nums[0]

            var first = nums[0]
            var second = 0
            var third = 0
                for (i in nums.indices) {
                when {
                    (nums[i] == first) -> continue
                    (nums[i] > first) -> {second = first; first = nums[i]
                    }
                    (nums[i] == second || nums[i] == third) -> continue
                    (nums[i] in second+1 until first) -> {third = second; second = nums[i] }
                    (nums[i] == third) -> continue
                    (nums[i] < second) -> if (third < nums[i]) third = nums[i]
                }

            }
            //println(" $first    $second   $third")
            if (nums.size <3 || third == 0) return second
            return third

        }
    val nums =  arrayOf(1,1,2)
    println(removeDuplicates(nums))
    println(nums.joinToString())

}