fun main() {
	val a = 2026
  val esBisiesto = a % 4 == 0 && a % 100 != 0

  println("El año $a es bisiesto: $esBisiesto")
}
