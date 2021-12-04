package day4

/**
 * @author Jordan Abraham
 */
class BingoBoard(
    boardId: Int,
    boardNumbers: List<String>
) {
    private val board = boardNumbers.subList(boardId * 5, (boardId * 5) + 5).map { it.trimStart().split(Regex("\\s+")).map { string -> string.toInt() }.toMutableList() }.toList()

    fun mark(call: Int) = board.forEach { it.forEachIndexed { index, number -> if (call == number) it[index] = -1 } }

    fun checkRowForWin(): Boolean = board.any { row -> row.all { it == -1 } }

    fun checkColumnForWin(): Boolean = with(0 until 5) { any { column -> all { row -> board[row][column] == -1 } } }

    fun sum(): Int = board.sumOf { row -> row.sumOf { if (it == -1) 0 else it } }
}