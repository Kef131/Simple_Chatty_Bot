import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do {
        val element = scanner.nextInt()
        sum += element
    }while (element != 0)
    println(sum)
}