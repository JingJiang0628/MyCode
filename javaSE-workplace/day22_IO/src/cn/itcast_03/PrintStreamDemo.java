package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ���ص㣺ֻ�ܶ�����д(ֻ�ܲ���Ŀ�ĵ�)
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
		
		
		
	}
}
