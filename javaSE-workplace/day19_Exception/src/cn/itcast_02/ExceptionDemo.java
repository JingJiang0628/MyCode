package cn.itcast_02;
/*
 * �����쳣
 * 1.try...catch...finally
 * 2.throws�׳�
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;//ArithmeticException,����ʱ�쳣
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
		
		System.out.println("over");
	}
}
