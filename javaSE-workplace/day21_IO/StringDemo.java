package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ʹ��ָ���ַ��������ֽ�����Ͱ��ַ�������Ϊ�ֽ�����
 * 
 * ���룺String--byte[]
 * ���룺byte[]--String
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="���";
//		byte[] b=s.getBytes();
//		byte[] b=s.getBytes("GBK");
//		System.out.println(Arrays.toString(b));//[-60, -29, -70, -61]
		byte[] b=s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(b));
		
		String ss=new String(b);
//		String ss=new String(b,"GBK");
//		String ss=new String(b,"UTF-8");//???
		System.out.println(ss);
		
	}
}
