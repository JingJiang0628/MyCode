package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		//Iterator iterator():������������ר�ñ�������
		Iterator it=c.iterator();//ʵ�ʷ���������������Ƕ�̬
		
		//next():��ȡԪ�ز�ִ�е���һλ��
//		Object obj=it.next();
//		System.out.println(obj);
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		//NoSuchElementException:��Ϊ�Ѿ��ҵ������
		//System.out.println(it.next());
		
		//����ÿ�λ�ȡǰ�ж�������һ��Ԫ�أ��вŻ�ȡ
		while(it.hasNext()==true){
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}
}
