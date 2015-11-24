fun main(args: Array<String>) {
    println(getNullable())
}

fun getNullable() {
    val ref = null ?: return
}
