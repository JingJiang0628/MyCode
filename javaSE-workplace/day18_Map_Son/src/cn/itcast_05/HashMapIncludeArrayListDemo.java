package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
 * HashMapǶ��ArrayList
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("����");
		a1.add("���");
		hm.put("��������", a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("������");
		a2.add("�ֱ���");
		hm.put("��¥��", a2);
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("�ֳ�");
		a3.add("����");
		hm.put("ˮ䰴�", a3);
		
		Set<String> set=hm.keySet();
		for(String key:set){
			System.out.println(key);
			ArrayList<String> value=hm.get(key);
			for(String s:value){
				System.out.println("\t"+s);
			} 
		}
		
	}
}
