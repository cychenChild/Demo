package demo;

public class Demo {
	public static void main(String args[]) {
		if (args.length==0){
			System.out.println("û�в������룺");
		}else{
			System.out.println("Command line arguments were: ");
		       for(int i=0;i<args.length;i++)    //ѭ�����������������յ��Ĳ���
		           System.out.println("Argument"+(i+1)+":"+args[i]);
		      }
		System.out.println("-------����Cell-----");
        Cell cell = new Cell();
        cell.row = 15;
        cell.col = 6;
//        printCell(cell);
 
        System.out.println("----Cell����һ��----");
        //����drop����������һ��
        cell.drop();
        printCell(cell);  
	}
	public static void printCell(Cell cell){
		for (int i=0 ; i<50;i++){
			for(int j=0;j<10;j++){
				if(i==cell.row&&j==cell.col){
					System.out.print("*  ");
				}else{
					System.out.print("-  ");
				}
				
			}
			System.out.println(i);
		}
		for(int i=1;i<=10;i++){
			System.out.print(i+"  ");
		}
		System.out.println();
	}

}
