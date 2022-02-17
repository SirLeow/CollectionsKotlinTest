package Collections

import kotlin.random.Random

fun main() {

    val repositorio = Repositorio<Funcionario>()

    listaFuncionarios.forEachIndexed { index, s ->
        repositorio.create(
            id = index,
            Funcionario(nome = s,
                        salario = Random.nextInt(1000,10000).toDouble(),
                        senha = Random.nextInt(1,5)
            )
        )
    }

    for(i in listaFuncionarios.indices){
        println(repositorio.findById(id = i))
    }
    println(div)
    repositorio.findAll().forEach{ println(it) }

    println(div)
    repositorio.remove(Random.nextInt(0, listaFuncionarios.size-1))
    repositorio.findAll().forEach{ println(it) }
}