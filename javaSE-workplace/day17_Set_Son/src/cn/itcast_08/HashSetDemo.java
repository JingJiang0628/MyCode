package cn.itcast_08;

import java.util.HashSet;
import java.util.Random;

/*
 * ��дһ�����򣬻�ȡ10��1-20���������Ҫ����������ظ�
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Random r=new Random();
		
		HashSet<Integer> t=new HashSet<Integer>();
		
		while(t.size()<10){
			int num=r.nextInt(20)-1;
			t.add(num);
		}
		for(Integer i:t){
			System.out.println(i);
		}
		
	}
}
