package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		//BufferedReader br=new BufferedReader(is);
		
//		InputStreamReader isr=new InputStreamReader(is);
//		BufferedReader br=new BufferedReader(isr);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		
		System.out.println("������һ���ַ�����");
		String line=br.readLine();
		System.out.println("������ַ����ǣ�"+line);
		
		System.out.println("������һ��������");
		int i=Integer.parseInt(br.readLine());
		System.out.println("����������ǣ�"+i);
		
	}
}
