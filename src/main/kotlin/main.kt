import kotlin.random.Random

fun main(args: Array<String>) {

    var clarray = clasearray(10){ Random.nextInt(50, 250)}

    clarray.arr.forEach { println(it) }


}