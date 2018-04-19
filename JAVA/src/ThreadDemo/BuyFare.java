package ThreadDemo;

import org.junit.Test;

public class BuyFare extends Thread{
	 DemoFare fare = new DemoFare();
	static int i = 0;
	public void run() {
		synchronized (fare.getClass()) {
			while(true){
				i++;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(fare.getFare()<=0){
					i--;
					System.out.println(this.getName()+"没有了");
					break;
				}else{
					fare.setFare(fare.getFare()-1);
					System.out.println(this.getName()+fare.getFare());
				}
				
			}
			System.out.println(i+"运行次数");
		}
		
	}
/*	public static synchronized void go() throws InterruptedException{
			while(true){
				i++;
				Thread.sleep(10);
				if(fare.getFare()<=0){
					i--;
					System.out.println(Thread.currentThread().getName()+"没有了");
					break;
				}else{
					fare.setFare(fare.getFare()-1);
					System.out.println(Thread.currentThread().getName()+fare.getFare());
				}
				
			}
			
			System.out.println(i+"运行次数");	
	}*/
	public BuyFare(String name) {
		super(name);
	}

}
