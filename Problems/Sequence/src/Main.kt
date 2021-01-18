import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstChar = scanner.next().first()
    val secondChar = scanner.next().first()
    val thirdChar = scanner.next().first()

    if (firstChar + 1 == secondChar && secondChar + 1 == thirdChar) {
        println(true)
    } else {
        print(false)
    }
}