package cn.itcast_07;

import java.util.Hashtable;

/*
 * Hashtable��HashMap������
 * Hashtable:�̰߳�ȫ��Ч�ʵͣ�������null����nullֵ
 * HashMap:�̲߳���ȫ��Ч�ʸߣ�����null����nullֵ
 */
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> hm=new Hashtable<String,String>();
		hm.put("itoo1", "hello");
		//NullPointerException
//		hm.put(null, "world");
//		hm.put("java", null);
		System.out.println(hm);
	}
}
