import kotlin.random.Random

fun main() {
    val mutFuncionario = mutableListOf<Funcionario>()
    listaFuncionarios.forEach{ mutFuncionario.add(Funcionario(nome = it, //add function
        salario = Random.nextInt(1000,10000).toDouble(),
        senha = Random.nextInt(1, 5)))
    }

    mutFuncionario.forEach{ println(it) } // show all
    println(div)
    mutFuncionario.removeIf { it.senha == 2 } //remove function
    mutFuncionario.forEach{ println(it) } //show all
    println(div)

}