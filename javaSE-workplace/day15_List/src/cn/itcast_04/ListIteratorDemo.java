package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator lit=list.listIterator();
//		while(lit.hasNext()){
//			String s=(String) lit.next();
//			System.out.println(s);
//		}
		
		//ListIterator��ʵ�����������������������������У�����һ�㲻ʹ��
		while(lit.hasPrevious()){
			String s=(String) lit.previous();
			System.out.println(s);
		}
	
		System.out.println("--------------");
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}
		System.out.println("---------------");
		
		
	}
}
