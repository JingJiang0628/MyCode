package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/*
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 */
public class UserDaoImpl implements UserDao {

	//���������һ����Ա�������þ�̬
	private static ArrayList<User> array=new ArrayList<User>();
	
	@Override
	public boolean isLogin(String username, String password) {
		boolean flag=false;
		
		for(User u:array){
			if(u.getUserName().equals(username)&&u.getPassword().equals(password)){
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		
		array.add(user);

	}

}
