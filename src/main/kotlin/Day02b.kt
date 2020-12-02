fun main() {
    val lines = {}::class.java.getResource("input02.txt").openStream().bufferedReader().readLines()
    print(lines.map { it.split(" ") }.filter { line ->
        val letter = line[1].replace(":", "")
        val range = line[0].split("-").map { it.toInt() }
        (letter == line[2][range[0]-1].toString()) xor (letter == line[2][range[1]-1].toString())
    }.size)
}