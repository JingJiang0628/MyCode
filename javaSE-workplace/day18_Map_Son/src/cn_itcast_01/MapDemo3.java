package cn_itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 * ���޶�
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "����Ӣ");
		map.put("������", "÷����");
		
		Set<String> set=map.keySet();
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"---"+value);
		}
	
	}
}
