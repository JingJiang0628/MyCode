package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//�������ں��ַ����ĸ�ʽ��(format)�ͽ���(parse)
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//Date---String
		Date d=new Date();
		//Ĭ��ģʽ
		SimpleDateFormat s=new SimpleDateFormat();
		
		String str=s.format(d);
		System.out.println(str);
		
		//����ģʽ:��y,��M����d,ʱH����m,��s
		SimpleDateFormat s2=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		
		String str2=s2.format(d);
		System.out.println(str2);
		
		//String---Date
		String str3="2008-08-08 12:12:12";
		SimpleDateFormat s3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd=s3.parse(str3);
		System.out.println(dd);
		
		
	}
}
