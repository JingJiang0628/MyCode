package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<Student,String>();
		Student s1=new Student("����",27);
		Student s2=new Student("���Ѿ�",30);
		Student s3=new Student("��ʩ",33);
		Student s4=new Student("����",27);
		Student s5=new Student("����",27);
		
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "3333");
		hm.put(s4, "2222");
		hm.put(s5, "5555");
		
		Set<Student> set=hm.keySet();
		for(Student key:set){
			String value=hm.get(key);
			System.out.println(key.getName()+"--"+key.getAge()+"---"+value);
		}
		
	}
}
