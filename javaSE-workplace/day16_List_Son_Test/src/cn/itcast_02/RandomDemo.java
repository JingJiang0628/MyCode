package cn.itcast_02;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r=new Random();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int count =0;
		while(count<10){
			int number=r.nextInt(20)+1;
			if(!arr.contains(number)){
				arr.add(number);
				count++;
			}
		}
		for(Integer i:arr){
			System.out.println(i);
		}
		
		
	}
}
