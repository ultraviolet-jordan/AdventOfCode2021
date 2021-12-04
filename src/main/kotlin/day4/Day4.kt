package day4

import Day

/**
 * @author Jordan Abraham
 */
object Day4 : Day<List<String>, Int> {

    override fun part1(input: List<String>): Int {
        val callNumbers = input.first().split(",").map { it.toInt() }

        val boards = buildList {
            val boardNumbers = input.filter { it != input.first() }
            repeat(boardNumbers.size / 5) {
                add(BingoBoard(it, boardNumbers))
            }
        }

        callNumbers.forEach { number ->
            boards.forEach { board ->
                board.mark(number)
            }
            val winners = checkWinners(boards)
            if (winners.isNotEmpty()) {
                return winners.first().sum() * number
            }
        }

        return 0
    }

    override fun part2(input: List<String>): Int {
        val callNumbers = input.first().split(",").map { it.toInt() }

        val boards = buildList {
            val boardNumbers = input.filter { it != input.first() }
            repeat(boardNumbers.size / 5) {
                add(BingoBoard(it, boardNumbers))
            }
        }

        val winningBoards = mutableListOf<BingoBoard>()
        callNumbers.forEachIndexed { index, number ->
            if (winningBoards.size == boards.size) {
                return winningBoards.last().sum() * callNumbers[index - 1]
            }

            boards.forEach { board ->
                board.mark(number)
            }
            val winners = checkWinners(boards).filter { winningBoards.contains(it).not() }
            if (winners.isNotEmpty()) {
                winningBoards.addAll(winners)
            }
        }

        return 0
    }

    private fun checkWinners(boards: List<BingoBoard>): List<BingoBoard> {
        val winners = buildList {
            boards.forEach {
                if (it.checkRowForWin() || it.checkColumnForWin()) {
                    add(it)
                }
            }
        }.distinct()
        return winners
    }
}