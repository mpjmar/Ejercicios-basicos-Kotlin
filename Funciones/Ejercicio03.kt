fun main() {
    val num = 21

	println("El número $num es par?: ${esPar(num)}")
}

fun esPar(num: Int) = num % 2 == 0
