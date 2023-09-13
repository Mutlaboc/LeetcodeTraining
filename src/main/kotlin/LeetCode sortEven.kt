fun main(args: Array<String>) {
    fun sortArrayByParity(nums: Array<Int>): Array<Int> {
        if (nums == null || nums.size <2) return nums

        for (i in nums.indices){
            var count = i+1
            //println(count)
            while (nums[i]%2 != 0 && count<nums.size){

                //println(count)
                var buff = nums[i]
                nums[i] = nums[count]
                nums[count] = buff
                //println(nums.joinToString())
                count++
            }
        }
        return nums
    }
    var nums = arrayOf(3,1,2,4)
    sortArrayByParity(nums)
    println(nums.joinToString())
}