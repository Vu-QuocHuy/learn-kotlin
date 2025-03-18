package Module4.ProgrammingAssignment

import Module4.ProgrammingAssignment.Direction.*

// Triển khai SquareBoard - Bảng vuông
open class SquareBoardImpl(override val width: Int) : SquareBoard {
    // Danh sách các ô của bảng, sử dụng danh sách 2D
    private val cells: List<List<Cell>> = List(width) { i ->
        List(width) { j -> Cell(i + 1, j + 1) } // Chỉ số bắt đầu từ 1
    }

    // Lấy ô theo tọa độ hoặc trả về null nếu ngoài phạm vi
    override fun getCellOrNull(i: Int, j: Int): Cell? =
        cells.getOrNull(i - 1)?.getOrNull(j - 1) // getOrNull tránh lỗi ngoài phạm vi

    // Lấy ô theo tọa độ, nếu không hợp lệ thì ném lỗi
    override fun getCell(i: Int, j: Int): Cell =
        getCellOrNull(i, j) ?: throw IllegalArgumentException("Cell ($i, $j) is out of bounds")

    // Lấy tất cả các ô trong bảng
    override fun getAllCells(): Collection<Cell> = cells.flatten()

    // Lấy danh sách ô trong hàng với phạm vi chỉ mục jRange
    override fun getRow(i: Int, jRange: IntProgression): List<Cell> =
        jRange.mapNotNull { j -> getCellOrNull(i, j) } // mapNotNull bỏ qua chỉ mục ngoài phạm vi

    // Lấy danh sách ô trong cột với phạm vi chỉ mục iRange
    override fun getColumn(iRange: IntProgression, j: Int): List<Cell> =
        iRange.mapNotNull { i -> getCellOrNull(i, j) }

    // Lấy ô lân cận của một ô theo hướng chỉ định
    override fun Cell.getNeighbour(direction: Direction): Cell? = when (direction) {
        UP -> getCellOrNull(i - 1, j)
        DOWN -> getCellOrNull(i + 1, j)
        LEFT -> getCellOrNull(i, j - 1)
        RIGHT -> getCellOrNull(i, j + 1)
    }
}

// Triển khai GameBoard mở rộng từ SquareBoard
class GameBoardImpl<T>(width: Int) : SquareBoardImpl(width), GameBoard<T> {
    // Lưu trữ giá trị tương ứng với mỗi ô Cell
    private val values: MutableMap<Cell, T?> = mutableMapOf()

    // Lấy giá trị của ô, nếu không có thì trả về null
    override fun get(cell: Cell): T? = values[cell]

    // Gán giá trị cho ô
    override fun set(cell: Cell, value: T?) {
        values[cell] = value
    }

    // Lọc danh sách ô theo điều kiện predicate
    override fun filter(predicate: (T?) -> Boolean): Collection<Cell> =
        values.filterValues(predicate).keys

    // Tìm ô đầu tiên thỏa mãn điều kiện predicate
    override fun find(predicate: (T?) -> Boolean): Cell? =
        values.entries.find { predicate(it.value) }?.key

    // Kiểm tra có ít nhất một ô thỏa mãn điều kiện không
    override fun any(predicate: (T?) -> Boolean): Boolean =
        values.values.any(predicate)

    // Kiểm tra tất cả các ô có thỏa mãn điều kiện không
    override fun all(predicate: (T?) -> Boolean): Boolean =
        values.values.all(predicate)
}

// Hàm tạo SquareBoard
fun createSquareBoard(width: Int): SquareBoard = SquareBoardImpl(width)

// Hàm tạo GameBoard với kiểu dữ liệu T
fun <T> createGameBoard(width: Int): GameBoard<T> = GameBoardImpl(width)

