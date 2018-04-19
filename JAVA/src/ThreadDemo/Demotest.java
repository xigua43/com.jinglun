package ThreadDemo;

import org.junit.Test;

public class Demotest {
	public static void main(String[] args) {
		Thread t1 = new BuyFare("线程一");
		Thread t2 = new BuyFare("线程二");
		Thread t3 = new BuyFare("线程三");
		Thread t4 = new BuyFare("线程四");
		t2.start();
		t1.start();	
		t3.start();
		t4.start();
		//t1.stop();
	}
/*	@Test
	public void test(){	
		Thread t1 = new BuyFare("线程一");
		Thread t2 = new BuyFare("线程二");
		Thread t3 = new BuyFare("线程三");
		Thread t4 = new BuyFare("线程四");
		t1.start();		
		t2.start();
		t3.start();
		t4.start();
		
	} */
}
