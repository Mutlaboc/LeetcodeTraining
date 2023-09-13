fun main(args: Array<String>) {
    fun removeElement(nums: Array<Int>, `val`: Int): Int {
        if (nums.isEmpty()) return nums.size
        if (nums.size < 2) {
            if (nums[0] == `val`) {
                nums.drop(0)
                return 0
            }
            else return 1

        }

        var uniq = 0
        var count = nums.size-1
        var counting  = 0
        var i = 0
        while (i  < count){
            println("проверка числа с индексом $i")
            println("count равен $count")
            //println(count)
            while (nums[i] == `val` && count>i){
                while (nums[count] == `val` && count>i) count--

                //println(count)
               var buff = nums[i]
                nums[i] = nums[count]
                nums[count] = buff
                count--



            }
            i++
            println("count равен $count")
            if (nums[i] != `val`) uniq++
        }
       println(nums.size)
       println(uniq)
        println(count)

        for (i in nums.indices){
            if (nums[i] != `val`) counting++
            else break
        }
        return counting
    }
    var nums = arrayOf(1)
    println(removeElement(nums, 1))
    println(nums.joinToString())

}