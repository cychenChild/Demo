package Cell;
import java.util.Scanner;
public class CellGame {
	public static void main(String[] args) {
        //�������Ӳ���ӡ
        Cell cell1 = new Cell(3,3);        
        printCell(cell1);
        
        //��Ϸ����
        System.out.println("1 ���� ���䣬2��������3�������ң�0 ���� �˳�");
        Scanner sc = new Scanner(System.in);
        int cmd = sc.nextInt();
        while (cmd != 0) {
            switch(cmd) {                
                case 1:
                    cell1.drop();
                    break;
                case 2:
                    cell1.moveLeft();
                    break;
                case 3:
                    cell1.moveRight();
                    break;
            }            
            printCell(cell1);
            System.out.println("1 ���� ���䣬2��������3�������ң�0 ���� �˳�");
            cmd = sc.nextInt();
        }
        System.out.println("��Ϸ����");
        sc.close();
    }
    public static void printCell(Cell cell) {
        int totalRow = 20;
        int totalCol = 10;
        //��ӡ���ӵ�λ��
        System.out.println("Cell��λ��Ϊ��(" + cell.getCellInfo() + ")");
        for (int row = 0; row < totalRow; row++) {
            for (int col = 0; col < totalCol; col++) {
                if (cell.row == row && cell.col == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
