package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		//set�洢����Ψһ
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("hello");
		set.add("java");
		
		for(String s:set){
			System.out.println(s);
		}
		
	}
}
