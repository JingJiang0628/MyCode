package cn.itcast_01;
/*
 * �쳣
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;//ArithmeticException,����ʱ�쳣
		System.out.println(a/b);
		System.out.println("over");
	}
}
