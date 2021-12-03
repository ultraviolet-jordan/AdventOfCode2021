package day2

import Day

/**
 * @author Jordan Abraham
 */
object Day2 : Day<Submarine, Int> {
    override fun solvePart1(input: Submarine): Int = input.horizontal * input.depth
    override fun solvePart2(input: Submarine): Int = input.horizontal * input.depth
}