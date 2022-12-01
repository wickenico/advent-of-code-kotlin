package day01

import readInput

fun main() {
    println(part1(readInput("day01", "input"), 1))
    println(part1(readInput("day01", "input"), 3))
}

fun part1(input: List<String>, count: Int): Int {
    return input.fold(mutableListOf(0)) { acc, s ->
        when {
            s.isNotBlank() -> acc[acc.lastIndex] = s.toInt() + acc.last()
            else -> acc.add(0)
        }
        acc
    }
        .sortedDescending()
        .take(count)
        .sum()
}
