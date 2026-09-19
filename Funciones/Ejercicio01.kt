fun main() {
	val radio = 25.5

    println("El área de un círculo de radio $radio es ${calcularAreaCirculo(radio)}")
}

fun calcularAreaCirculo(radio: Double): Double {
    return Math.PI * radio * radio
}
