package cn.itcast_02;

public class StudentDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.toString());//cn.itcast_02.Student@2a139a55
		System.out.println("------------------");
		//toString()������ֵ�ȼ���getClass().getName()+��@��+Integer��toHexString(hashCode())
		System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));
		System.out.println(s.toString());
		
		//ֱ�������������,�൱�ڵ���toString()����
		System.out.println(s);
		
	}

}
