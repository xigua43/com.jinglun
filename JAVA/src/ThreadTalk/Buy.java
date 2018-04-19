package ThreadTalk;

public class Buy implements Runnable{
	private Shop s;
	public Shop getS() {
		return s;
	}
	public void setS(Shop s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true){

			synchronized (s) {
				
				if(s.isType()){
					try {
						System.out.println("�̵����� ��ʼ��ɱ==========");
						s.wait();
							
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}else{
					System.out.println(Thread.currentThread().getName()+"��ɱ����ʼ����=========");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					s.setType(true);
					s.notify();
				}
			}
		}
		
	}
	public Buy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buy(Shop s) {
		super();
		this.s = s;
	}

}
