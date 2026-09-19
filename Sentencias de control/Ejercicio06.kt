fun main() {
  val h = 4

  for (i in 1..h) {
    var n = 1
  	for (j in 1..h - i) {
    	print(" ")
    }
    for (j in 1..i) {
        print(n++)
    }
    n = i - 1
    for (j in h downTo 1) {
        if (j < i) print(n--)
    }
    println()
  }
}
