import kotlin.random.Random

data class Funcionario(
    val nome:String,
    val salario:Double,
    val senha:Int
){
    override fun toString(): String = """
        Nome: $nome - Salario: $salario - Senha: $senha        
    """.trimIndent()
}

class insert{
    companion object {
        val sother   = Funcionario(nome = "Sother ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val aseyoi   = Funcionario(nome = "Aseyoi ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val rewigi   = Funcionario(nome = "Rewigi ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val bia      = Funcionario(nome = "Bia    ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val rebeca   = Funcionario(nome = "Rebeca ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val cheetos  = Funcionario(nome = "Cheetos", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val debora   = Funcionario(nome = "Debora ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
        val juan     = Funcionario(nome = "Juan   ", salario = Random.nextInt(1000, 10000).toDouble(), senha = Random.nextInt(1,5))
    }
}