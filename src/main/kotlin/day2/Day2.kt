package day2

import Day

/**
 * @author Jordan Abraham
 */
object Day2 : Day<Submarine, Int> {
    override fun part1(input: Submarine): Int = input.horizontal * input.depth
    override fun part2(input: Submarine): Int = input.horizontal * input.depth
}
