fun main(args: Array<String>) {
    println(getNullable())
}

fun getNullable() {
    // Using Elvis operator(?:)
    val ref = null ?: return
}
