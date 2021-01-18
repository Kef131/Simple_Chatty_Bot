import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeses = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    println(!weekend && reeses >= 10 && reeses <= 20 || weekend && reeses >= 15 && reeses <= 25)
}
