package Collections

import kotlin.random.Random

fun main() {
    val divider = "--------------------------------"
    val salarios = DoubleArray(5)
    salarios.forEachIndexed { index, _ -> salarios[index] = Random.nextInt(100,10000).toDouble() }

    salarios.forEach { println(it) }
    println(divider)

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario *1.5
    }

    for (i in salarios) println(i)
    println(divider)

    salarios.sort()
    salarios.forEach { println(it) }

}