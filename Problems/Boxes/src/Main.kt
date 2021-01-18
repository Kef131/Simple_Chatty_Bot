import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val box1X = scanner.nextInt()
    val box1Y = scanner.nextInt()
    val box1Z = scanner.nextInt()
    val box2X = scanner.nextInt()
    val box2Y = scanner.nextInt()
    val box2Z = scanner.nextInt()
    var incomparableFlag = false
    val incomparable = "Incomparable"
    // Volume is main reference to check the space in boxes
    val areaBox1 = box1X * box1Y * box1Z
    val areaBox2 = box2X * box2Y * box2Z

    // I detect a pattern. If a box has one value that is greater than
    // all the other values AND that box has at least another value that
    // is less than the other values,  is incomprable
    // I refence greater than others as MMM -> Major Major Major and
    // mmm -> menor menor menor
    if (box1X > box2X && box1X > box2Y && box1X > box2Z) {
        if (box1Y < box2X && box1Y < box2Y && box1Y < box2Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box1Z < box2X && box1Z < box2Y && box1Z < box2Z) {
            println(incomparable)
            incomparableFlag = true
        }
    } else if (box1Y > box2X && box1Y > box2Y && box1Y > box2Z) {
        if (box1X < box2X && box1X < box2Y && box1X < box2Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box1Z < box2X && box1Z < box2Y && box1Z < box2Z) {
            println(incomparable)
            incomparableFlag = true
        }
    } else if (box1Z > box2X && box1Z > box2Y && box1Z > box2Z) {
        if (box1X < box2X && box1X < box2Y && box1X < box2Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box1Y < box2X && box1Y < box2Y && box1Y < box2Z) {
            println(incomparable)
            incomparableFlag = true
        }
    } else if (box2X > box1X && box2X > box1Y && box2X > box1Z) {
        if (box2Y < box1X && box2Y < box1Y && box2Y < box1Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box2Z < box1X && box2Z < box1Y && box2Z < box1Z) {
            println(incomparable)
            incomparableFlag = true
        }

    } else if (box2Y > box1X && box2Y > box1Y && box2Y > box1Z) {
        if (box2X < box1X && box2X < box1Y && box2X < box1Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box2Z < box1X && box2Z < box1Y && box2Z < box1Z) {
            println(incomparable)
            incomparableFlag = true
        }
    } else if (box2Z > box1X && box2Z > box1Y && box2Z > box1Z) {
        if (box2X < box1X && box2X < box1Y && box2X < box1Z) {
            println(incomparable)
            incomparableFlag = true
        } else if (box2Y < box1X && box2Y < box1Y && box2Y < box1Z) {
            println(incomparable)
            incomparableFlag = true
        }
    }
    // If everything went well, we can check as simple as
    if (areaBox1 == areaBox2 && !incomparableFlag) {
        println("Box 1 = Box 2")
    } else if (areaBox1 > areaBox2 && !incomparableFlag) {
        println("Box 1 > Box 2")
    } else if (areaBox1 < areaBox2 && !incomparableFlag) {
        println("Box 1 < Box 2")
    }
}