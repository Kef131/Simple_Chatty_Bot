import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstChar = scanner.next().first()
    val secondChar = scanner.next().first()
    val thirdChar = scanner.next().first()
    val fourthChar = scanner.next().first()

    print("${firstChar.isDigit()}\\${secondChar.isDigit()}\\${thirdChar.isDigit()}\\${fourthChar.isDigit()}")
    /*
    if (firstChar.isDigit()) {
        print("true\\")
    }else {
        print("false\\")
    }
    if (secondChar.isDigit()) {
        print("true\\")
    }else {
        print("false\\")
    }
    if (thirdChar.isDigit()) {
        print("true\\")
    }else {
        print("false\\")
    }
    if (fourthChar.isDigit()) {
        print("true")
    }else {
        print("false")
    }

     */

}