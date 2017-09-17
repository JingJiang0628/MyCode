package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student("����ϼ",27);
		Student s2=new Student("������",30);
		Student s3=new Student("����",32);
		Student s4=new Student("�ֳ�",25);
		Student s5=new Student("����ϼ",27);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//����1(��Ȼ����)
//		Collections.sort(list);		
		//����2���Ƚ�������
		//���ͬʱ����Ȼ����ͱȽ������򣬾��ñȽ���
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				int num=s2.getAge()-s1.getAge();
				int num2=num==0?s2.getName().compareTo(s1.getName()):num;
				return num2;
			}
			
		});
		
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		
	}
}
