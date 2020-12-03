import java.math.BigInteger

fun main() {
    val lines = {}::class.java.getResource("input03.txt").openStream().bufferedReader().readLines()
        .map { it.split("").subList(1, 32); }
    val lineLength = lines[0].size
    var counter: Long = 1
    for (right in 1..7 step 2) {
        var x = 0
        var singleCounter = 0
        for (down in 1 until lines.size) {
            x = ((x + right) % lineLength)
            if (lines[down][x] == "#") {
                singleCounter++
            }
        }
        counter *= singleCounter
    }
    println(counter)
    var x = 0
    var singleCounter = 0
    for (down in 2 until lines.size step 2) {
        x = ((x + 1) % lineLength)
        if (lines[down][x] == "#") {
            singleCounter++
        }
    }
    print(singleCounter)
    counter *= singleCounter

    println()
    println(counter)
}