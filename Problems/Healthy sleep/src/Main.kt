import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val minSleepHours = scanner.nextInt()
    val maxSleepHours = scanner.nextInt()
    val annSleepHours = scanner.nextInt()

    if (annSleepHours in minSleepHours..maxSleepHours) {
        print("Normal")
    } else {
        if (annSleepHours < minSleepHours) {
            print("Deficiency")
        }
        if (annSleepHours > maxSleepHours) {
            print("Excess")
        }
    }
}