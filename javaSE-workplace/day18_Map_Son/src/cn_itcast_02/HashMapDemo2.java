package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(27, "����ϼ");
		hm.put(30, "������");
		hm.put(28, "����");
		hm.put(29, "����ϼ");
		
		//0��ͷ��ʾ�˽��ƣ����ǲ��ܳ��ְ����ϵĵ�������
//		hm.put(002, "hello");
//		hm.put(008, "hello");//����
		
		Set<Integer> set=hm.keySet();
		for(Integer key:set){
			String value =hm.get(key);
			System.out.println(key+"--"+value);
		}
		
		//��������Ǽ���Ԫ���ַ����ı�ʾ
		System.out.println("hm:"+hm);
		
	}
}
