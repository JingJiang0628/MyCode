package cn.itcast_04;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		sb.replace(5, 10, "���տ���");
		System.out.println(sb);
	}
}
