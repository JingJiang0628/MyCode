package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,HashMap<String,ArrayList<Student>>> hm=new HashMap<String,HashMap<String,ArrayList<Student>>>();
		
		//����
		HashMap<String,ArrayList<Student>> bjhm=new HashMap<String,ArrayList<Student>>();
		//������
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student("����ϼ",27);
		Student s2=new Student("������",30);
		a1.add(s1);
		a1.add(s2);
		//��ҵ��
		ArrayList<Student> a2=new ArrayList<Student>();
		Student s3=new Student("����֥",27);
		Student s4=new Student("����",30);
		a2.add(s3);
		a2.add(s4);
		bjhm.put("jc", a1);
		bjhm.put("jy", a2);
		hm.put("����У��",bjhm);
		
		//�Ϻ�
		HashMap<String,ArrayList<Student>> shhm=new HashMap<String,ArrayList<Student>>();
		//������
		ArrayList<Student> a3=new ArrayList<Student>();
		Student s11=new Student("�ֳ�",24);
		Student s22=new Student("����",22);
		a3.add(s11);
		a3.add(s22);
		//��ҵ��
		ArrayList<Student> a4=new ArrayList<Student>();
		Student s33=new Student("������",27);
		Student s44=new Student("�ֱ���",30);
		a4.add(s33);
		a4.add(s44);
		shhm.put("jc", a3);
		shhm.put("jy", a4);
		hm.put("�Ϻ�У��",shhm);
		
		//����
		HashMap<String,ArrayList<Student>> gzhm=new HashMap<String,ArrayList<Student>>();
		//������
		ArrayList<Student> a5=new ArrayList<Student>();
		Student s111=new Student("����ϼ",27);
		Student s222=new Student("������",30);
		a5.add(s111);
		a5.add(s222);
		//��ҵ��
		ArrayList<Student> a6=new ArrayList<Student>();
		Student s333=new Student("����֥",27);
		Student s444=new Student("����",30);
		a6.add(s333);
		a6.add(s444);
		gzhm.put("jc", a5);
		gzhm.put("jy", a6);
		hm.put("����У��",bjhm);
		
		Set<String> set1=hm.keySet();
		for(String key1:set1){
			System.out.println(key1);
			HashMap<String,ArrayList<Student>> value1=hm.get(key1);
			Set<String> set2=value1.keySet();
			for(String key2:set2){
				System.out.println("\t"+key2);
				ArrayList<Student> value2=value1.get(key2);
				for(Student s:value2){
					System.out.println("\t\t"+s.getName()+"--"+s.getAge());
				}
			}
		}
		
	}
}
