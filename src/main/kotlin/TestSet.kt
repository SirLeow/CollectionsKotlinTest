import kotlin.random.Random

fun main() {
    val div = "--------------------"
    val funcionarios = setOf(sother, aseyoi, rewigi, bia, rebeca, cheetos, debora, juan)
    val group1 = (funcionarios.filter {it.senha == Random.nextInt(1,5)}).toSet()
    val group2 = (funcionarios.filter {it.senha == Random.nextInt(1,5)}).toSet()
    val union = group1.union(group2)
    val subtract = funcionarios.subtract(group1)
    val intersect = funcionarios.intersect(group2)

    println("Funcionarios")
    funcionarios.forEach{ println(it) }
    println(div)
    println("Group 1")
    group1.forEach{ println(it) }
    println(div)
    println("Group 2")
    group2.forEach{ println(it) }
    println(div)
    println("Union")
    union.forEach{ println(it) }
    println(div)
    println("Subtract")
    subtract.forEach{ println(it) }
    println(div)
    println("Intersect")
    intersect.forEach{ println(it) }
    println(div)

}

