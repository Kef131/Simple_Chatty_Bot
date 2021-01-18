import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    var sum: Long = 1
    for (i in a until b) {
        sum *= i
    }
    println(sum)
}
