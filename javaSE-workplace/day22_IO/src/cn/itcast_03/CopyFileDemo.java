package cn.itcast_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new FileReader("DataStreamDemo.java"));
//		BufferedWriter bw=new BufferedWriter(new FileWriter("copy.java"));
//		
//		String line=null;
//		while((line=br.readLine())!=null){
//			bw.write(line);
//			bw.newLine();
//			bw.flush();
//		}
//		
//		bw.close();
//		br.close();
		
		//��װԴ
		BufferedReader br=new BufferedReader(new FileReader("DataStreamDemo.java"));
		//��װĿ�ĵ�
		PrintWriter pw=new PrintWriter(new FileWriter("copy.java"),true);
		String line=null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
		
		
	}
}
