package day06

import readInput

fun main() {

    val input = readln()

    println(part1(input))
    println(part2(input))
}

private fun findMarker(buffer: String, numDistinctCharacters: Int): Int {
    return buffer.windowed(numDistinctCharacters)
        .indexOfFirst { it.toSet().size == numDistinctCharacters }
        .plus(numDistinctCharacters)
}

private fun part1(buffer: String): Int {
    return findMarker(buffer, 4)
}

private fun part2(buffer: String): Int {
    return findMarker(buffer, 14)
}