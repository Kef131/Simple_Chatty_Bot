fun main(args: Array<String>) {
    val limitSequence = readLine()!!.toInt()
    var sequenceString = ""
    var stopSequence = 1
    var printNumber = 1

    while (stopSequence <= limitSequence) {
        var counter = printNumber
        do {
            sequenceString = "$sequenceString$printNumber "
            counter--
            stopSequence++
        } while (counter > 0 && stopSequence <= limitSequence)
        printNumber++
    }
    println(sequenceString)
    // 30
}
