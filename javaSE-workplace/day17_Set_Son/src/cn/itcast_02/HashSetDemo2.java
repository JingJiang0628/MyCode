package cn.itcast_02;

import java.util.HashSet;
/*
 * �洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * ��������ĳ�Ա������ͬ��Ϊͬһ����
 * ����HashSet�ײ���������hashCode��equals����
 * ������û����Student������д�����Թ�ϣֵ��һ���Ͳ��ܱ�֤Ψһ��
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> h=new HashSet<Student>();
		
		Student s1=new Student("lin",27);
		Student s2=new Student("fan",30);
		Student s3=new Student("wang",30);
		Student s4=new Student("lin",27);
		Student s5=new Student("lin",20);
		
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);
		
		for(Student s:h){
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}
}
