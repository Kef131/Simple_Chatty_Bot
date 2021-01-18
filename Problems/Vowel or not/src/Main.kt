fun isVowel(vowel: Char): Boolean {
    when (vowel.toLowerCase()) {
        'a' -> return true
        'e' -> return true
        'i' -> return true
        'o' -> return true
        'u' -> return true
        else -> false
    }
    return false
}

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}