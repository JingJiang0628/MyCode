package cn.itcast.game;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber(){
	
	}

	public static void start(){
		int number=(int) (Math.random()*100)+1;
		
		int count=0;
		
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("����������1-100��");
		int guessNumber=sc.nextInt();
		
		count++;
		
		if(guessNumber>number){
			System.out.println("��µ����ݣ�"+guessNumber+"����");
		}else if(guessNumber<number){
			System.out.println("��µ�����"+guessNumber+"С��");
			
		}else{
			System.out.println("��ϲ��"+count+"�β����ˣ���");
			break;
		}
	}
	}

}
