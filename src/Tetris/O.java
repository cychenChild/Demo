package Tetris;

public class O {
	Cell[] cells;// ����,�����洢һ��������ĸ����ӵ�����
    /**
     * ���췽����Ϊ����cells���г�ʼ��
     */
    public O() {
        this(0, 0);
    }
    /**
     * ���췽����Ϊ����cells���г�ʼ��
     * 
     * @param row
     *            ˳ʱ�뷽�� ����һ���������
     * @param col
     *            ˳ʱ�뷽�� ����һ���������
     */
    public O(int row, int col) {
        cells = new Cell[4];
        // ��˳ʱ�뷽���ʼ��Cell
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row + 1, col);
        cells[3] = new Cell(row + 1, col + 1);
    }
    /**
     * ��˳ʱ�뷽�򣬴�ӡ�������ĸ��������ڵ�����
     */
    public void print() {
        String str = "";
        for (int i = 0; i < cells.length - 1; i++) {
            str += "(" + cells[i].getCellInfo() + "), ";
        }
        str += "(" + cells[cells.length - 1].getCellInfo() + ")";
        System.out.println(str);
    }
    /**
     * ʹ��������һ������
     */
    public void drop() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].row++;
        }
    }
    /**
     * ʹ��������һ������
     */
    public void moveLeft() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col--;
        }
    }
    /**
     * ʹ�÷�������һ������
     */
    public void moveRight() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col++;
        }
    }
}
