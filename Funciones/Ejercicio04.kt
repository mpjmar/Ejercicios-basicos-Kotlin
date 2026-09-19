fun main() {
    // val multiplos = (1..600).filter { num -> num % 7 == 0 }
    val multiplos = (1..600).filter { it % 7 == 0 }

    println(multiplos)
}
