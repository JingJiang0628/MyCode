package cn.itcast_03;

import java.util.Arrays;
import java.util.List;
/*
 * public static <T> List<T> asList(T... a):������ת���ɼ���
 * ��Ȼ���԰�����ת���ɼ��ϣ����ǳ��Ȳ��ܱ�
 */
public class ArraysDemo {
	public static void main(String[] args) {
//		String[] str={"hello","world","java"};
//		List<String> list=Arrays.asList(str);
		
		List<String> list=Arrays.asList("hello","world","java");
		//UnsupportedOperationException
		//list.add("javaee");
		//UnsupportedOperationException
		//list.remove(1);
		list.set(1, "javaee");
		
		
		
		for(String s:list){
			System.out.println(s);
		}
		
		
		
	}
}
