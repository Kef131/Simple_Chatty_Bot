import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()

    if (value > -15 && value <= 12) {
        print("True")
    } else if (value in 15..16) {
        print("True")
    } else if (value >= 19) {
        print("True")
    } else {
        println("False")
    }
}