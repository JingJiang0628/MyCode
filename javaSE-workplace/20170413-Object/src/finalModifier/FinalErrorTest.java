package finalModifier;

public class FinalErrorTest {

	//����һ��final���ε�ʵ������
	//ϵͳ�������Ĭ�ϳ�ʼ��
	final int age;
	{
		//System.out.println(age);//������Ϊageû��ʼ��
		age=6;
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalErrorTest();
	}

}
