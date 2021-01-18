import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val beginning = scanner.nextInt()
    val end = scanner.nextInt()
    for (i in beginning..end) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }
}