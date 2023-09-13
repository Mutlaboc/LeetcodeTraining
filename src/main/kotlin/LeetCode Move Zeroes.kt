fun main(args: Array<String>) {
    fun moveZeroes(nums: Array<Int>): Unit {
        if (nums == null || nums.size <2) return
        var count = 0
        for (i in nums.indices){
            var count = i+1
            //println(count)
            while (nums[i] == 0 && count<nums.size){

                //println(count)
                nums[i] = nums[count]
                nums[count] = 0
                //println(nums.joinToString())
                count++
            }
        }

    }
    var nums = arrayOf(0,1,0,3,12)
    moveZeroes(nums)
    println(nums.joinToString())
}