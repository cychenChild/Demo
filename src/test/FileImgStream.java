package test;

import java.io.*;

public class FileImgStream {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("E:\\file\\img\\game.jpg");
		FileOutputStream fout = new FileOutputStream("E:\\file\\img\\game0.jpg");
		System.out.println("�ļ��Ĵ�С="+fin.available());
		byte[] b = new byte[fin.available()];
		fin.read(b);
		fout.write(b);
		System.out.print("�ļ��ѱ����Ʋ���������");
		fin.close();
		fout.close();
	}
}
