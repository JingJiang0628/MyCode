package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
//		Iterator it=list.iterator();
//		while(it.hasNext()){
//			String s=(String) it.next();
//			if("world".equals(s)){
//				//ConcurrentModificationException:
//				//�����޸��쳣
//				//��Ϊ�������������ϴ��ڣ����������Ԫ�أ���it��������֪������������
//				//���Ե���������Ԫ��ʱ�����޸�Ԫ��
//				
//				list.add("javaee");
//			}
//		}
		
		
		//���
		//1.����������Ԫ�أ��������޸�Ԫ��
		//����Ԫ�ظ��ڵ���Ԫ��֮��
//		ListIterator lit=list.listIterator();
//		while(lit.hasNext()){
//			String s=(String) lit.next();
//			if("world".equals(s)){
//				lit.add("javaee");
//			}
//		}
		
		//2.���ϱ���Ԫ�أ������޸�Ԫ��
		//Ԫ����������
		for(int x=0;x<list.size();x++){
			String s=(String) list.get(x);
			if("world".equals(s)){
				list.add("javaee");
			}
		}
		
		
		
		System.out.println(list);
	}
}
