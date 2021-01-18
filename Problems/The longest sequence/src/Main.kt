import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nSize = scanner.nextInt()
    var currentSequence = 1
    var longestSequence = 1
    var previousInt = scanner.nextInt()
    for (i in 2..nSize) {
        val nextInt = scanner.nextInt()
        if (previousInt <= nextInt) {
            currentSequence++
            previousInt = nextInt
        } else {
            previousInt = nextInt
            currentSequence = 1
        }
        if (currentSequence > longestSequence) {
            longestSequence = currentSequence
        }
    }
    println(longestSequence)
    // 12
    // 1 2 4 1 2 3 5 7 8 9 10 11
}