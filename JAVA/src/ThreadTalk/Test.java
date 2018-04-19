package ThreadTalk;

public class Test {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Buy buy = new Buy(shop);
		People people = new People(shop);
		People people2 = new People(shop);
		People people3 = new People(shop);
		People people4 = new People(shop);
		
		Thread t = new Thread(buy,"商店");
		Thread t2 = new Thread(people,"买家1");
		Thread t3= new Thread(people2,"买家2");
		Thread t4 = new Thread(people3,"买家3");
		Thread t5 = new Thread(people4,"买家4");
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
