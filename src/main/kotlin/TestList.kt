import kotlin.random.Random

fun main() {
    val sother = Funcionario(nome = "Sother", salario = Random.nextInt(1000, 10000).toDouble())
    val aseyoi = Funcionario(nome = "Aseyoi", salario = Random.nextInt(1000, 10000).toDouble())
    val rewigi = Funcionario(nome = "Rewigi", salario = Random.nextInt(1000, 10000).toDouble())

    val funcionarios = listOf(sother, aseyoi, rewigi)

    funcionarios.forEach{println(it)
    println()
    }

    println("--------------------")
    println(funcionarios.find { it.nome == "Aseyoi" })
}

data class Funcionario(
    val nome:String,
    val salario:Double
){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario        
    """.trimIndent()
}