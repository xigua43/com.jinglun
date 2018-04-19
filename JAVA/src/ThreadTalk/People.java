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
						System.out.println(Thread.currentThread().getName()+"商品被秒杀 等待上线");
						s.wait();
					} catch (InterruptedException e) {
						//线程阻塞
						e.printStackTrace();
					}
					
				}else{
					System.out.println(Thread.currentThread().getName()+"秒杀=========");
					
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
