package cn.itcast_07;

public class SellTicket implements Runnable{
	private int tickets=100;
	private Object obj=new Object();
	
	@Override
	public void run() {
		//int tickets=100;
		while(true){
			synchronized (obj) {
				if(tickets>0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets--+"��Ʊ��");
				}
				}
			}
		
	}
}
