package cn.itcast_04;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student();
		s.setName("lin");
		s.setAge(27);
		//��¡ѧ������;Cloneable�ӿ���һ����ǽӿڣ�����ʵ�ָýӿڵ���Ϳ���ʵ�ֶ���ĸ���
		Object obj=s.clone();
		Student s2=(Student)obj;
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println("---------------");
		//����¡
		Student s3=s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------------");
		
		//������
		s3.setName("liu");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}

}

