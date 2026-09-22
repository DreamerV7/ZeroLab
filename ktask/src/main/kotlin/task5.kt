fun main(args: Array<String>) {
    args.groupingBy { it }.eachCount()
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> {it.second}.thenBy { it.first })
        .forEach {println("${it.first} ${it.second}")
        }
}