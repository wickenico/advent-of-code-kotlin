package day04

import readInput

fun main() {
    println(part1(readInput("day04", "input")))
    println(part2(readInput("day04", "input")))
}

fun part1(input: List<String>): Int {
    var result = 0
    input.forEach { line ->
        val ranges = line.split(",")
        val first = ranges[0].split("-").map { it.toInt() }
        val second = ranges[1].split("-").map { it.toInt() }
        if ((first[0] >= second[0] && first[1] <= second[1]) ||
            (second[0] >= first[0] && second[1] <= first[1])
        ) {
            result++
        }
    }
    return result
}

fun part2(input: List<String>): Int {
    var result = 0
    input.forEach { line ->
        val ranges = line.split(",")
        val first = ranges[0].split("-").map { it.toInt() }
        val second = ranges[1].split("-").map { it.toInt() }
        if ((second[0] <= first[1] && second[0] >= first[0]) || (first[0] <= second[1] && first[0] >= second[0])) {
            result++
        }
    }
    return result
}
