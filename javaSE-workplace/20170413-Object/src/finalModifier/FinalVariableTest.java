package finalModifier;

public class FinalVariableTest {
	//�����Ա����ʱָ��Ĭ��ֵ
	final int a=6;
	//���±����ڹ������г�ʼ��
	final String str;
	final int c;
	final static double d;
	//û�����κεط�ָ����ʼֵ
	//final char ch;
	//��ʼ���飬Ϊû��ָ��Ĭ��ֵ��ʵ������ָ����ʼֵ
	{
		str="hello";
		//a=9;//�������¸�ֵ
	}
	//��̬��ʼ���飬û��ָ��Ĭ��ֵ�������ָ����ʼֵ
	static {
		d=5.6;
	}
	//������ûָ��Ĭ��ֵ��û�ڳ�ʼ�����е�ʵ������ָ����ʼֵ
	public FinalVariableTest(){
		//�����ٶ��Ѿ��г�ʼֵ�ĵ�final�������¸�ֵ
		//str="java";
		c=5;
	}
	public void changeFinal(){
		//��ͨ��������Ϊfinal������ֵ
		//d=1.2;
		//ch='a';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableTest ft=new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}

}
