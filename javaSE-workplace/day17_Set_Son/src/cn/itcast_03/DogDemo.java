package cn.itcast_03;

import java.util.HashSet;

public class DogDemo {
	public static void main(String[] args) {
		HashSet<Dog> h=new HashSet<Dog>();
		
		Dog d1=new Dog("С��",10,"��ɫ",'��');
		Dog d2=new Dog("С��",9,"��ɫ",'Ů');
		Dog d3=new Dog("С��",10,"��ɫ",'��');
		Dog d4=new Dog("С��",8,"��ɫ",'Ů');
		Dog d5=new Dog("С��",7,"��ɫ",'Ů');
		Dog d6=new Dog("С��",6,"��ɫ",'Ů');
		Dog d7=new Dog("С��",6,"��ɫ",'Ů');
		Dog d8=new Dog("С��",6,"��ɫ",'��');
		
		h.add(d1);
		h.add(d2);
		h.add(d3);
		h.add(d4);
		h.add(d5);
		h.add(d6);
		h.add(d7);
		h.add(d8);
		
		for(Dog d:h){
			System.out.println(d.getName()+" "+d.getAge()+" "+d.getColor()+" "+d.getSex());
		}
		
	}
	
	
	
}
