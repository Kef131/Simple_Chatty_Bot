import java.util.Scanner
fun main(args: Array<String>) {
    /**
     * Write a program that reads three numbers and checks if they all are different (i.e. no number equals to any other).

    The program is to output true or false.
     *
     * Sample Input 1:

    5 5 9
    Sample Output 1:

    false
    Sample Input 2:

    1 2 3
    Sample Output 2:

    true
     */
    val scanner = Scanner(System.`in`)
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    println(!(number1 == number2 || number2 == number3 || number3 == number1))
}