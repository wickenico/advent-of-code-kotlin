package day02

import readInput

fun main() {
    println(part2(readInput("day02", "input"), strategy1))
    println(part2(readInput("day02", "input"), strategy2))
}

private val strategy1 = mapOf(
    'A' to mapOf('X' to 1 + 3, 'Y' to 2 + 6, 'Z' to 3 + 0),
    'B' to mapOf('X' to 1 + 0, 'Y' to 2 + 3, 'Z' to 3 + 6),
    'C' to mapOf('X' to 1 + 6, 'Y' to 2 + 0, 'Z' to 3 + 3)
)

private val strategy2 = mapOf(
    'A' to mapOf('X' to 3 + 0, 'Y' to 1 + 3, 'Z' to 2 + 6),
    'B' to mapOf('X' to 1 + 0, 'Y' to 2 + 3, 'Z' to 3 + 6),
    'C' to mapOf('X' to 2 + 0, 'Y' to 3 + 3, 'Z' to 1 + 6)
)

private fun part2(input: List<String>, strategy: Map<Char, Map<Char, Int>>) = input.sumOf { strategy[it[0]]?.get(it[2]) ?: 0 }
