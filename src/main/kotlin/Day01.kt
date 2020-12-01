fun main() {
    val lines = {}::class.java.getResource("input01.txt").openStream().bufferedReader().readLines().map { it.toInt() }
    lines.forEachIndexed { index1, i1 ->
        for (index2 in index1 + 1 until lines.size) {
            for (index3 in index2 + 1 until lines.size) {
                if (i1 + lines[index2] + lines[index3] == 2020) {
                    println(i1 * lines[index2] * lines[index3]);
                }
            }
        }
    }
}