package Tetris;

public class TestO {
	public static void main(String[] args) {
        O o=new O(0,5);
        //����print����
        System.out.println("ԭʼ����Ϊ��");
        o.print();
        
        //����drop����
//        o.drop();
//        System.out.println("����drop����������꣺");
//        o.print();
        
        //����moveLeft����
//        o.moveLeft();
//        System.out.println("����moveLeft����������꣺");
//        o.print();
        
        //����moveRight����
        o.moveRight();
        System.out.println("����moveRight����������꣺");
        o.print();
    }
}
