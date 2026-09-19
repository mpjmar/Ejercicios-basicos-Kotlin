fun main() {
	val edad = 54

  println("Estado: ${situacion(edad)}")
}

fun situacion(edad: Int) = if (edad < 19) "menor de edad" else if (edad < 65) "activo" else "jubilado"
