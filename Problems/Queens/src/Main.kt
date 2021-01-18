import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextDouble()
    val y1 = scanner.nextDouble()
    val x2 = scanner.nextDouble()
    val y2 = scanner.nextDouble()

    // Take the first queen as base
    // Get slope and check if it one
    val slope = (y2 - y1) / (x2 - x1)
    if (abs(slope) == 1.0) {
        print("YES")
    } else if (x1 == x2) {
        print("YES")
    } else if (y1 == y2) {
        print("YES")
    } else {
        print("NO")
    }
    // 4 4 6 2
    // 4 4 6 7
}