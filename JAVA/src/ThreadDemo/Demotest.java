package ThreadDemo;

import org.junit.Test;

public class Demotest {
	public static void main(String[] args) {
		Thread t1 = new BuyFare("�߳�һ");
		Thread t2 = new BuyFare("�̶߳�");
		Thread t3 = new BuyFare("�߳���");
		Thread t4 = new BuyFare("�߳���");
		t2.start();
		t1.start();	
		t3.start();
		t4.start();
		//t1.stop();
	}
/*	@Test
	public void test(){	
		Thread t1 = new BuyFare("�߳�һ");
		Thread t2 = new BuyFare("�̶߳�");
		Thread t3 = new BuyFare("�߳���");
		Thread t4 = new BuyFare("�߳���");
		t1.start();		
		t2.start();
		t3.start();
		t4.start();
		
	} */
}
