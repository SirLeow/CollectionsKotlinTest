package Collections
class Repositorio<k>{
    private val map = mutableMapOf<Int, k>()

    fun create(id: Int, value: k){
        map[id] = value
    }

    fun remove(id:Int) = map.remove(id)
    fun findById(id:Int) = map[id]
    fun findAll() = map.values

}