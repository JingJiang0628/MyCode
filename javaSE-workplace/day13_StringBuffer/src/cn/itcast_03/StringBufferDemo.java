package cn.itcast_03;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		//deleteCharAtɾ��ָ��λ��
//		sb.deleteCharAt(1);
//		sb.deleteCharAt(1);
		
		//deleteɾ����ָ��λ�õ�ָ�����������󲻰���
//		sb.delete(5, 10);
		
		//ɾ������
		sb.delete(0, sb.length());
		System.out.println(sb);
	}
}
