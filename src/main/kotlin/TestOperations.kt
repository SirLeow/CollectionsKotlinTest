import kotlin.random.Random

fun main() {
    val divider = "--------------------------------"
    val salarios = DoubleArray(10)
    salarios.forEachIndexed { index, _ -> salarios[index] = Random.nextInt(100,10000).toDouble() }
    salarios.forEach { println(it) }
    println(divider)

    salarios.sort()
    salarios.forEach { println(it) }
    println(divider)

    println("Menor salario =  ${salarios.minOrNull()}")
    println("Media salarial = ${salarios.average()}")
    println("Maior salario =  ${salarios.maxOrNull()}")


    val over2500 = salarios.filter { it >2500 }

    println(divider)
    over2500.forEach{ println(it) }
    println(divider)

    println("Menor salario =  ${over2500.minOrNull()}")
    println("Media salarial = ${over2500.average()}")
    println("Maior salario =  ${over2500.maxOrNull()}")

    println(divider)
    println(salarios.count())
    println(salarios.count { it >= salarios.average() })

    println(divider)
    println(salarios.find { it == over2500[0] })
    println(salarios.find { it == 2841.0 })

    println(divider)
    println(salarios.any())
    println(salarios.any { it == salarios.minOrNull() })
    println(salarios.any { it == over2500.average() })

}