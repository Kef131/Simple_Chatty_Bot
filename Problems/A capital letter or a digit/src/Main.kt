fun main(args: Array<String>) {
    val char = readLine()!!.first()
    print("${char.isUpperCase() || Character.getNumericValue(char) in 1..9}")
}