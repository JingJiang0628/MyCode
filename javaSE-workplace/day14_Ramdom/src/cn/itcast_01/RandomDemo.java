package cn.itcast_01;

import java.util.Random;

/*
 * Ramdom:�������������
 * 
 * ���췽����
 * 		public Random():û�и����ӣ���Ĭ�ϵģ��ǵ�ǰʱ��ĺ���ֵ
 * 		public Random(long seed):��������,��ÿ�εõ�����������
 * ��Ա������
 * 		nextInt()������int��Χ�ڵ������
 * 		nextInt(int n)������[0,n)��Χ��
 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		//Random r=new Random();
		Random r=new Random(1111);
		
		for(int x=0;x<10;x++){
			//int num=r.nextInt();
			int num=r.nextInt(100)+1;
			System.out.println(num);
		}
	}
}
