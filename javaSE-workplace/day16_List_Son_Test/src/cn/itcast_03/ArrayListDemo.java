package cn.itcast_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨����������ݵ��е����ֵ
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(true){
			System.out.println("Please input:");
			int number =sc.nextInt();
			if(number!=0){
				arr.add(number);
			}else{
				break;
			}
		}
		
		Integer[] i=new Integer[arr.size()];
		//i��ii�ĵ�ֵַһ������ͬһ�������Բ��ý�iתΪii
		//Integer[] ii=arr.toArray(i);
		arr.toArray(i);
		//System.out.println(i);
		//System.out.println(ii);
		
		Arrays.sort(i);
		System.out.println("�����ǣ�"+arrayToString(i)+"���ֵ�ǣ�"+i[i.length-1]);
		
	}
	
	public static String arrayToString(Integer[] i){
		StringBuilder sb=new StringBuilder();
		
		sb.append("[");
		for(int x=0;x<i.length;x++){
			if(x==i.length-1){
				sb.append(i[x]);
			}else{
				sb.append(i[x]).append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
		
	}
}
