fun main(args: Array<String>) {

        fun removeDuplicates(nums: Array<Int>): Int {

            val newAr = IntArray(nums.size)
            newAr[0] = nums[0]
            var count = 0
                for (i in nums.indices) {
                if (nums[count] != nums[i]) {
                    count++
                    nums[count] = nums[i]


                }
            }

            return count

        }
    val nums =  arrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicates(nums))
    println(nums.joinToString())

}