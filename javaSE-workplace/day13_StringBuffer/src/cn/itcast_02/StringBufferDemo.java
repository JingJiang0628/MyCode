package cn.itcast_02;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		
//		StringBuffer sb2=new StringBuffer("hello");
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb==sb2);
		
		//��β�����
		//һ��һ���������
//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(34.56);
		
		//��ʽ���
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println(sb);
		//��ָ��λ�����
		sb.insert(5, "world");
		System.out.println(sb);
		
	}
	
}
