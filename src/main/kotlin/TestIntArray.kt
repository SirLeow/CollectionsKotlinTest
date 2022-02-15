import kotlin.random.Random

fun main() {
    val divider = "--------------------------------"
    val values = IntArray(5)
    values[0] = Random.nextInt(0,100)
    values[1] = Random.nextInt(0,100)
    values[2] = Random.nextInt(0,100)
    values[3] = Random.nextInt(0,100)
    values[4] = Random.nextInt(0,100)

    for (valor in values) println(valor)
    println(divider)
    values.forEach { println(it) }
    println(divider)
    for (index in values.indices) println(values[index])
    println(divider)
    values.sort()
    for (valor in values) println(valor)
}