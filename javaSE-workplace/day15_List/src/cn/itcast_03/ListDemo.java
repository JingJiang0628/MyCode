package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//����
		//list.add(1,"abdroid");
		//IndexOutOfBoundsException
		//list.add(11,"abdroid");
		//list.add(3,"javaee");
		
		//��ȡ
		//System.out.println(list.get(1));
		//IndexOutOfBoundsException
		//System.out.println(list.get(11));
		
		//ɾ��
		//System.out.println(list.remove(1));
		//IndexOutOfBoundsException
		//System.out.println(list.remove(11));
		
		//�޸�
		System.out.println(list.set(1, "javaee"));
		
		System.out.println(list);
		
		
	}
}
