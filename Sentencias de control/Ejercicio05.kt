fun main() {
	val num = 12430
    val res = invertir(num)

    println("Número original: $num")
    println("Número invertido: $res")
}

fun invertir(n: Int): String {
    var num = n
    var res = ""

    while (num > 0) {
    	res += num % 10
        num /= 10
    }

    return res
}
