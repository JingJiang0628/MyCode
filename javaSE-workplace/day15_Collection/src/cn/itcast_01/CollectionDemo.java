package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

//���ϳ��ȿɱ䣬ֻ�ܴ洢�������ͣ����󣩣����Դ洢��ͬ�������͵Ķ���
//Java�ṩ��ͬ�����࣬�������������ݽṹ��ͬ�����й��ԣ��洢����ȡ���жϵȣ�

public class CollectionDemo {
	public static void main(String[] args) {
		//���󣬽ӿڲ���ʵ����
		//Collection c=new Collection();
		Collection c=new ArrayList();
		
		//add����boolean��
		//System.out.println(c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//�Ƴ�����Ԫ��
		//c.clear();
		
		//System.out.println(c.remove("hello"));
		//System.out.println(c.remove("hellohaha"));
		
		//System.out.println(c.contains("hello"));
		//System.out.println(c.contains("hellojava"));
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
		System.out.println(c);
		
	}
}
