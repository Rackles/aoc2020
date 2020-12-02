fun main() {
    val lines = {}::class.java.getResource("input02.txt").openStream().bufferedReader().readLines()
    print(lines.map { it.split(" ") }.filter { line ->
        val letter = line[1].replace(":", "")
        val number = line[2].filter { it.toString() == letter }.length
        val range = line[0].split("-").map { it.toInt() }
        number in range[0]..range[1]
    }.size)
}