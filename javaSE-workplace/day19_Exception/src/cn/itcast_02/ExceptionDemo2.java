package cn.itcast_02;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		//method1();
		method2();
	}

	public static void method2() {
		int a=10;
		int b=0;
		try{
		System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
		
		int[] arr={1,2,3};
		try{ 
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��������������");
		}
		System.out.println("over");
	}

	public static void method1() {
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
