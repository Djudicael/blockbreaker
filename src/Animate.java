
public class Animate implements Runnable{
	
	BlockBreakerPanel bp;
	
	Animate (BlockBreakerPanel b){
		bp =b;
	}

	@Override
	public void run() {
		while(true){
			bp.update();
			try {
				try {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
