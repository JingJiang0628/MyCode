package finalModifier;

import java.util.Arrays;

class Person{
	private int age;
	public Person(){}
	public Person(int age){
		this.age=age;
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		this.age=i;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final�����������������Ϊһ�����ñ���
		final int[] iArr={5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		//������Ԫ������
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2]=-8;
		System.out.println(Arrays.toString(iArr));
		//��iArr���¸�ֵ���Ƿ�
		//iArr=null;
		//final����Person������p��һ�����ñ���
		final Person p=new Person(45);
		p.setAge(23);
		System.out.println(p.getAge());
		//��p���¸�ֵ���Ƿ�
		//p=null;
	}

}
