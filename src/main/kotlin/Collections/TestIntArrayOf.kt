package Collections

import kotlin.random.Random

fun main() {
    val divider = "--------------------------------"
    val values = intArrayOf(
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100),
        Random.nextInt(0,100)
    )

    values.forEach { println(it) }
    println(divider)

    for (i in values) println(i)
    println(divider)

    values.sort()
    for (i in values) println(i)
    println(divider)


}