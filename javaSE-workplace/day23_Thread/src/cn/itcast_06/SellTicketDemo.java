package cn.itcast_06;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s=new SellTicket();
		
		Thread t1=new Thread(s,"����1");
		Thread t2=new Thread(s,"����2");
		Thread t3=new Thread(s,"����3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
