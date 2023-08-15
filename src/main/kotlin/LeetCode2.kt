fun main(args: Array<String>) {

    fun checkIfExist(arr: Array<Int>): Boolean {
        if (arr.isEmpty() || arr == null)
            return false
        var exist = false
        for (i in arr.indices){
            for (c in arr.indices){
            if (c == i) continue

            else if (arr[i]*2 == arr[c]){
                println("совпадение ${arr[i]} и ${arr[c]}")
                exist = true
                break
            }
            else if (arr[i]%2 == 0){
                if (arr[i]/2 == arr[c]){
                    println("совпадение ${arr[i]} и ${arr[c]}")
                    exist = true
                    break
                }
            }
                println("проверено число $c ")
            }
        }
        return exist
    }

    val test = arrayOf(-2,0,10,-19,4,6,-8)
    checkIfExist(test)
}