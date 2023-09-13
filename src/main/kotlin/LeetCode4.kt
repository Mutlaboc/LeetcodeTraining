fun main(args: Array<String>) {
    fun replaceElements(arr: Array<Int>): Array<Int> {
        if (arr == null) return arr
        if (arr.size <2) {
            arr[0] = -1
            return arr
        }
    var buff = arr[arr.size-1]
        arr[arr.size-1] = -1
        for (i in arr.size-2 downTo 0){
            var buffInn = arr[i]
            arr[i] = buff
            if (buffInn>buff) {
                buff = buffInn
            }

        }
        return arr
    }
    var arr = arrayOf(17,18,5,4,6,1)
    println(replaceElements(arr).joinToString())
}