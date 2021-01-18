package bot

import java.util.Scanner


val scanner = Scanner(System.`in`)

fun main() {
    greet("Kef", "2020")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("What's data structure is used to save ordered elementos? and What is user to have repeteaded items?")
    println("1. List and Set")
    println("2. Set and Map")
    println("3. Set and List")
    println("4. Neither one")
    val inputAnswer = scanner.nextInt()
    while(inputAnswer != 1) {
        println("Please, try again.")
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}