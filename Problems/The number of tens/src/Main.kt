import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val integer = scanner.nextInt()
    var tens = integer
    tens -= integer % 10
    tens %= 100
    tens /= 10
    println(tens)

}