package cn.itcast_02;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1=new ThreadPriority();
		ThreadPriority tp2=new ThreadPriority();
		ThreadPriority tp3=new ThreadPriority();
		
		tp1.setName("lin");
		tp2.setName("zhu");
		tp3.setName("fan");
		
		//IllegalArgumentException:�Ƿ������쳣
		//tp1.setPriority(10000);
		//�߳����ȼ���Χ1-10
		
//		System.out.println(tp1.getPriority());
//		System.out.println(tp2.getPriority());
//		System.out.println(tp3.getPriority());
		
		tp1.setPriority(10);
		tp3.setPriority(1);
		
		tp1.start();
		tp2.start();
		tp3.start();
	
	}
}