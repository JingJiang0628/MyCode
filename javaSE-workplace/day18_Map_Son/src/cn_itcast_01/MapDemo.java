package cn_itcast_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args){
		Map<String ,String> m=new HashMap<String,String>();
		
		//put:��Ӻ���
//		System.out.println("put:"+m.put("����", "�����P"));
//		System.out.println("put:"+m.put("����", "Ҧ��"));
		
		m.put("����", "Ҧ��");
		m.put("huang", "yang");
		m.put("zhou", "kun");
		m.put("liu", "mi");
		
		//ɾ��
//		System.out.println("remove:"+m.remove("huang"));
//		System.out.println("remove:"+m.remove("huangxiaobo"));
		
		//��ѯ
//		System.out.println("containsKey:"+m.containsKey("huang"));
//		System.out.println("containsKey:"+m.containsKey("huangxiaobo"));
		
		//System.out.println("containsKey:"+m.containsValue("mi"));
		
		//Ϊ�գ�
		//m.clear();
		//System.out.println("isEmpty:"+m.isEmpty());
		
		System.out.println("size:"+m.size());
		
		System.out.println("map:"+m);
		
	}
}
