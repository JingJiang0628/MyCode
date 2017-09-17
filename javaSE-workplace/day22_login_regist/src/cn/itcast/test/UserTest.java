package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/*
 * �û�������
 */
public class UserTest {
	public static void main(String[] args) {
		while(true){
		System.out.println("----------��ӭ����---------");
		System.out.println("1.��¼");
		System.out.println("2.ע��");
		System.out.println("3.�˳�");
		System.out.println("���������ѡ��");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		UserDao ud=new UserDaoImpl();
		
		switch (str) {
		case "1":
			System.out.println("----------��¼����---------");
			System.out.println("�������û�����");
			String username=sc.nextLine();
			System.out.println("���������룺");
			String password=sc.nextLine();
			
			boolean flag=ud.isLogin(username, password);
			if(flag){
				System.out.println("��¼�ɹ�����");
				System.out.println("Ҫ����Ϸ��y/n");
				
				while(true){
					String resultString=sc.nextLine();
					//boolean flag1=false;
					if(resultString.equalsIgnoreCase("y")){
					GuessNumber.start();
					System.out.println("������");
				}else{
					break;
				}
				}
				System.out.println("ллʹ�ã�");
				System.exit(0);
			}else{
				System.out.println("�û����������д���¼ʧ�ܣ�");
			}
			
			break;
		case "2":
			System.out.println("----------ע�����---------");
			System.out.println("�������û�����");
			String newUsername=sc.nextLine();
			System.out.println("���������룺");
			String newPassword=sc.nextLine();
			
			User user=new User();
			user.setUserName(newUsername);
			user.setPassword(newPassword);
			
			
			
			ud.regist(user);
			System.out.println("ע��ɹ���");
			break;
		case "3":	
		default:
			System.out.println("ллʹ�ã���ӭ�´�������");
			System.exit(0);
			break;
		}
		
		}
		
	}
}
