package EH;

public class AsyncRun implements Runnable{
	@Override
	public void run() {
		try {
		System.out.println("AsyncRun on thread "+ Thread.currentThread().getId());
		throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println("Other problem :"+ e);
		}
	}
	
	
	
	
}
