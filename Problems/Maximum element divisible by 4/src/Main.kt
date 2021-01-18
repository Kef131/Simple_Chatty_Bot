import java.util.Scanner
fun main() {
    val scanner =  Scanner(System.`in`)

    val elementSize = scanner.nextInt()
    var maxElementDiv = 0
    repeat(elementSize) {
        val newValue = scanner.nextInt()
        if(newValue % 4 == 0 && newValue > maxElementDiv) {
            maxElementDiv = newValue
        }
    }
    println(maxElementDiv)
}