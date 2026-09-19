fun main() {
  val items = listOf("campamento", "cardinales", "polen", null, "hoja", "hermana", "relatividad", null)

  for (item in items) {
      println("Longitud de $item: " + mostrarLongitud(item))
  }
}

fun mostrarLongitud(text: String?): Int? {
    if (text != null) return text.length
    else return null
}
