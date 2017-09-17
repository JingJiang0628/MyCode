package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {
	private static File file=new File("user.txt");
	static{
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");
		}
	}
	
	@Override
	public boolean isLogin(String userName, String password) {
		boolean flag=false;
		BufferedReader br=null;
		try{
			//br=new BufferedReader(new FileReader("user.txt"));
			br=new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null){
				String[] datas=line.split("=");
				if(datas[0].equals(userName)&&datas[1].equals(password)){
					flag=true;
					break;
				}
			}
		}catch(FileNotFoundException e){
			System.out.println("�û��Ҳ�����Ϣ���ڵ��ļ�");
		}catch(IOException e){
			System.out.println("�û���¼ʧ��");
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("�û���¼�ͷ���Դʧ��");
				}
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		BufferedWriter bw=null;
		try {
//			bw=new BufferedWriter(new FileWriter("user.txt"));
			bw=new BufferedWriter(new FileWriter(file));
			bw.write(user.getUserName()+"="+user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("�û�ע��ʧ�ܣ�");
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
