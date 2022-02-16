import kotlin.random.Random

fun main() {
    val pair: Pair<String, Double> = Pair(temp[Random.nextInt(0, temp.size-1)], Random.nextInt(1000,10000).toDouble())
    val map1 = mapOf(pair)

    map1.forEach{(k,v)-> println("Chave: $k - Valor: $v") }
    println(div)

    val map2 = mapOf(
        temp[Random.nextInt(0, temp.size-1)] to Random.nextInt(1000,10000).toDouble(),
        temp[Random.nextInt(0, temp.size-1)] to Random.nextInt(1000,10000).toDouble()
    )

    map2.forEach{(k,v) -> println("Chave: $k - Salario: $v") }
}