fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val fourth = readLine()!!.toInt()
    val fifth = readLine()!!.toInt()

    print(fifth in first..second && fifth in third..fourth)
}