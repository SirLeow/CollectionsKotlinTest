fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "teste1"
    nomes[1] = "teste2"
    nomes[2] = "teste3"
    val nomes2 = arrayOf("teste1","teste2","teste3")

    for (i in nomes) println(i)
    println("----------")
    nomes2.forEach { println(it) }


}