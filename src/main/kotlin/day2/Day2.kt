package day2

import Day

/**
 * @author Jordan Abraham
 */
class Day2 : Day<Submarine, Int> {
    override fun solvePart1(input: Submarine): Int = input.horizontal * input.depth
    override fun solvePart2(input: Submarine): Int = input.horizontal * input.depth
}