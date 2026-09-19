fun main() {
	println(saludar("Paz"))
}

fun saludar(nombre: String, saludo: String = "Hola"): String {
    return "$saludo $nombre!"
}
