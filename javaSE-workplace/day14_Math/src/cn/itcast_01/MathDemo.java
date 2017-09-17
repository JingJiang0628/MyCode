package cn.itcast_01;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//����ֵ
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println("-----------------");
		//����ȡ��
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		//����ȡ��
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("-----------------");
		//���ֵ
		System.out.println(Math.max(12, 23));
		System.out.println(Math.max(Math.max(12, 23),18));
		System.out.println(Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("------------------");
		//a��b����
		System.out.println(Math.pow(2, 3));
		System.out.println("------------------");
		//�����
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)+1);
		System.out.println("-----------------");
		//��������
		System.out.println(Math.round(12.34f));
		System.out.println(Math.round(12.56f));
		System.out.println("------------------");
		//��ƽ����
		System.out.println(Math.sqrt(25));
		
	}
}
