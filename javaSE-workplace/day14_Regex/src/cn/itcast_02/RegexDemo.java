package cn.itcast_02;

import java.util.Scanner;

//�ж��ֻ������Ƿ�����Ҫ��
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input telenumber:");
		String teleNum=sc.nextLine();
		
		String regex="1[38]\\d{9}";
		
		boolean flag=teleNum.matches(regex);
		System.out.println(flag);
	}

}
