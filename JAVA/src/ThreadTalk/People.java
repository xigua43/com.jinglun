package ThreadTalk;

public class People implements Runnable{
	private Shop s;
	public Shop getS() {
		return s;
	}
	public void setS(Shop s) {
		this.s = s;
	}
	@Override
	public void run() {

		synchronized (s) {
			while(true){
				if(!s.isType()){					
					try {
						System.out.println(Thread.currentThread().getName()+"��Ʒ����ɱ �ȴ�����");
						s.wait();
					} catch (InterruptedException e) {
						//�߳�����
						e.printStackTrace();
					}
					
				}else{
					System.out.println(Thread.currentThread().getName()+"��ɱ=========");
					
					s.setType(false);
					s.notify();
					
				}
			}
		}
	}
	public People(Shop s) {
		super();
		this.s = s;
	}
	
}
