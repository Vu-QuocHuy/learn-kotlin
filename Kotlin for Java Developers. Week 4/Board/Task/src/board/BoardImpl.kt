package board

import board.Direction.*

open class SquareBoardImpl(override val width: Int) : SquareBoard {
    private val cells: List<List<Cell>> = List(width) { i -> List(width) { j -> Cell(i + 1, j + 1) } }

    override fun getCellOrNull(i: Int, j: Int): Cell? =
        if (i in 1..width && j in 1..width) cells[i - 1][j - 1] else null

    override fun getCell(i: Int, j: Int): Cell =
        getCellOrNull(i, j) ?: throw IllegalArgumentException("Invalid cell coordinates: ($i, $j)")

    override fun getAllCells(): Collection<Cell> = cells.flatten()

    override fun getRow(i: Int, jRange: IntProgression): List<Cell> =
        jRange.filter { it in 1..width }.map { j -> getCell(i, j) }

    override fun getColumn(iRange: IntProgression, j: Int): List<Cell> =
        iRange.filter { it in 1..width }.map { i -> getCell(i, j) }

    override fun Cell.getNeighbour(direction: Direction): Cell? = when (direction) {
        UP -> getCellOrNull(i - 1, j)
        DOWN -> getCellOrNull(i + 1, j)
        LEFT -> getCellOrNull(i, j - 1)
        RIGHT -> getCellOrNull(i, j + 1)
    }
}

class GameBoardImpl<T>(width: Int) : SquareBoardImpl(width), GameBoard<T> {
    private val values: MutableMap<Cell, T?> = mutableMapOf()

    override fun get(cell: Cell): T? = values[cell]
    override fun set(cell: Cell, value: T?) {
        values[cell] = value
    }

    override fun filter(predicate: (T?) -> Boolean): Collection<Cell> =
        values.filter { predicate(it.value) }.keys

    override fun find(predicate: (T?) -> Boolean): Cell? =
        values.entries.find { predicate(it.value) }?.key

    override fun any(predicate: (T?) -> Boolean): Boolean =
        values.values.any(predicate)

    override fun all(predicate: (T?) -> Boolean): Boolean =
        values.values.all(predicate)
}

fun createSquareBoard(width: Int): SquareBoard = SquareBoardImpl(width)
fun <T> createGameBoard(width: Int): GameBoard<T> = GameBoardImpl(width)

