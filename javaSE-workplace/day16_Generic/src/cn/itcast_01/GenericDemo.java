package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		//arr.add(new Integer(100));
		//arr.add(10);//�ȼ���arr.add(Integer.valueOf(10))
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext()){
			//ClassCastException
			//��Ϊ���Ǵ���String��Integer�������ͣ����������ĳ���String
			String s=it.next();
			System.out.println(s);
		}
	}
}
