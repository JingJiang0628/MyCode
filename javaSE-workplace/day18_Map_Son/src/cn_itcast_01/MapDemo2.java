package cn_itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String ,String> m=new HashMap<String,String>();
		
		m.put("����", "Ҧ��");
		m.put("huang", "yang");
		m.put("zhou", "kun");
		m.put("liu", "mi");
		
		System.out.println("get:"+m.get("zhou"));
		System.out.println("get:"+m.get("zhoujie"));
		System.out.println("--------------");
		
		//��ȡ���������м��ļ���(����)
		Set<String> set=m.keySet();
		for(String key:set){
			System.out.println(key);
		}
		
		//��ȡ����������ֵ�ļ���(����)
		Collection<String> con =m.values();
		for(String value:con){
			System.out.println(value);
		}
		
		
	}
}
