import kotlin.random.Random
const val div = "--------------------"
fun main() {
    val sother = Funcionario(nome = "Sother", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
    val aseyoi = Funcionario(nome = "Aseyoi", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
    val rewigi = Funcionario(nome = "Rewigi", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))

    val funcionarios = listOf(sother, aseyoi, rewigi)

    funcionarios.forEach{println(it)
    println()
    }

    println(div)
    println(funcionarios.find { it.nome == "Aseyoi" })

    println(div)
    funcionarios.
    sortedBy { it.salario }.
    forEach{ println(it) }

    println(div)
    funcionarios.
    groupBy { it.senha }.
    forEach{ println(it) }
}
