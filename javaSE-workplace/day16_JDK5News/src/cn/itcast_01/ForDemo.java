package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5�����ԣ��Զ���װ�䣬���ͣ���ǿfor����̬���룬�ɱ������ö��
 */
public class ForDemo {
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("-------------");
		
		//��ǿfor
		for(int x:arr){
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		String[] str={"lin","feng","dong","liu"};
		for(String s:str){
			System.out.println(s);
		}
		
		System.out.println("------------");
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		for(String s:array){
			System.out.println(s);
		}
		System.out.println("--------------");
		
		List<String> list=null;
		//NullPointerException
		//��ǿfor��Ŀ�겻��Ϊnull���������ж�
		if(list!=null){
		for(String s:list){
			System.out.println(s);
		}
		}
		
		//��ǿfor��ʵ�����������������
		//ConcurrentModificationException
		//֤�����������
		for(String s:array){
			if("world".equals(s)){
				array.add("javaee");
			}
		}
		System.out.println(array);
		
	}
}
