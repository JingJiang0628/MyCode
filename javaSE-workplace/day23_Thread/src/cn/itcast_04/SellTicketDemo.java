package cn.itcast_04;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s1=new SellTicket();
		SellTicket s2=new SellTicket();
		SellTicket s3=new SellTicket();
		
		s1.setName("����1");
		s2.setName("����2");
		s3.setName("����3");
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}
