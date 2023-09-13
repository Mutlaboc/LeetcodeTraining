fun main(args: Array<String>) {

        fun validMountainArray(arr: Array<Int>): Boolean {
            var valid = true
            var peak = 0
            var peakOne = false
            var peaktwo = false
            var i = 0
            if (arr.size < 3 || arr.size == null) return false
        while (i < arr.size-1){
            while(peak == 0 && i < arr.size-1) {
                if (arr[i] < arr[i+1]) {
                    i++
                    peakOne = true
                    continue
                }
                else peak++
            }
            while (peak > 0 && i < arr.size-1) {
                if (arr[i] > arr[i+1]) {
                    i++
                    peak++
                    peaktwo = true
                    continue
                }
                else return false
            }
            //println(arr.size)
            //println(peak)

        }
            return (peakOne && peaktwo)
        }

    val arr = arrayOf(2,1)
    println(validMountainArray(arr))
}