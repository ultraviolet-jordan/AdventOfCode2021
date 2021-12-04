package day4

/**
 * @author Jordan Abraham
 */
class BingoBoard(
    boardId: Int,
    boardNumbers: List<String>
) {
    private val board = boardNumbers.subList(boardId * 5, (boardId * 5) + 5).map { v -> v.trimStart().replace("\\s\\s".toRegex(), " ").split("\\s".toRegex()).map { s -> s.toInt() }.toMutableList() }.toList()

    fun mark(call: Int) {
        board.forEach {
            it.forEachIndexed { index, value -> if (call == value) it[index] = -1 }
        }
    }

    fun checkRowForWin(): Boolean {
        board.forEach { list ->
            if (list.count { it == -1 } == 5) return true
        }
        return false
    }

    fun checkColumnForWin(): Boolean {
        repeat(5) { digit ->
            val list = buildList {
                repeat(5) { row ->
                    add(board[row][digit])
                }
            }
            if (list.count { it == -1 } == 5) return true
        }
        return false
    }

    fun sum(): Int = board.sumOf { it.filter { v -> v != -1 }.sum() }
}