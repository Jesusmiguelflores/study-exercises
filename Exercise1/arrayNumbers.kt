fun main(args: Array<String>) {
    val numberArray : IntArray = intArrayOf(1, 6, 7, 2, 8)
    println("Resultado: " + checkIfItsOrdered(numberArray))

}

fun checkIfItsOrdered(numberArray: IntArray):Boolean {
    var counter: Int = 0
    var currentPosition: Int = numberArray.size
    for (index in numberArray.indices) {
        if (index < numberArray.size - 1 && numberArray[index] > numberArray[index + 1]) {
            counter++
            currentPosition = index + 1
        }
    }
    if(counter > 1) return false
    if(counter == 0 || currentPosition == 1 || currentPosition == numberArray.size - 1) return true
    if((numberArray[currentPosition - 1] < numberArray[currentPosition + 1]) || numberArray[currentPosition - 2] < numberArray[currentPosition]) return true
    return false
}