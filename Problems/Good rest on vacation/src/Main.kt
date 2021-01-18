import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val foodPerDay = scanner.nextInt()
    val flights = scanner.nextInt() * 2
    val hotelNights = days - 1
    val hotelCost = scanner.nextInt()
    println(days * foodPerDay + hotelNights * hotelCost + flights)
}