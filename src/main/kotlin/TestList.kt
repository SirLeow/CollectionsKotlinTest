import kotlin.random.Random

fun main() {
    val div = "--------------------"
    val sother = Funcionario(nome = "Sother", salario = Random.nextInt(1000, 10000).toDouble(), tipo = "CLT")
    val aseyoi = Funcionario(nome = "Aseyoi", salario = Random.nextInt(1000, 10000).toDouble(), tipo = "PJ")
    val rewigi = Funcionario(nome = "Rewigi", salario = Random.nextInt(1000, 10000).toDouble(), tipo = "CLT")

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
    groupBy { it.tipo }.
    forEach{ println(it) }
}
