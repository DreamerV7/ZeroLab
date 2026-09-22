fun main(args: Array<String>) {
    val words = if (args.isNotEmpty()) args.toList() else generateSequence { readLine() }
        .flatMap { it.split(Regex("\\s+")).asSequence() }
        .toList()

    words.groupingBy { it }.eachCount()
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })
        .forEach { println("${it.first} ${it.second}") }
}