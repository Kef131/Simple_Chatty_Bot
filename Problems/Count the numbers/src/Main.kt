import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
//    var counter = 0
//    for (number in a..b) {
//        if (number % n == 0) counter++
//    }
    println(b / n - (a - 1) / n)
//    print(counter)
}
