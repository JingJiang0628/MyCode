package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;
/*
 * HashMap��֤����Ψһ��
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("it001", "����");
		hm.put("it002", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���");
		hm.put("it001", "�ȶ��Ǵ�");
		
		//����
		Set<String> set=hm.keySet();
		for(String key:set){
			String value=hm.get(key);
			System.out.println(key+"-"+value);
		}
		
	}
}
