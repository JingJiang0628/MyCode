package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ArrayListǶ��HashMap
 */
public class ArrayListIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("���", "С��");
		hm1.put("����", "����");
		array.add(hm1);
		
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		array.add(hm2);
		
		HashMap<String,String> hm3=new HashMap<String,String>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		array.add(hm3);
		
		for(HashMap<String,String> hm:array){
			
			Set<String> set=hm.keySet();
			for(String key:set){
				String value=hm.get(key);
				System.out.println(key+"--"+value);
			}
		}
		
	}
}
