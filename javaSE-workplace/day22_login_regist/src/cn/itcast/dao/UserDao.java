package cn.itcast.dao;

import cn.itcast.pojo.User;

/*
 * ��������û����в����Ľӿ�
 */
public interface UserDao {
	/*
	 * �����û���¼����
	 */
	public abstract boolean isLogin(String userName,String password);
	/*
	 * �����û�ע�Ṧ��
	 */
	public abstract void regist(User user);
}
