fun main(args: Array<String>) {
   println(sum(1,2))
   println(sum(1,2,3)) 
}

fun sum(a: Int, b:Int): Int {
	return a + b
}

fun sum(a: Int, b: Int, c: Int) = a + b + c
