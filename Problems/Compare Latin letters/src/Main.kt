import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val latin1 = scanner.next()
    val latin2 = scanner.next()

    if (latin1.equals(latin2, ignoreCase = true)) {
        println(true)
    } else {
        println(false)
    }
}