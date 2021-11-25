package EH;

public class MainEH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread t = new Thread(new AsyncRun());
			t.start();
			System.out.println("main on thread " + Thread.currentThread().getId());
			throw new NullPointerException();
		}catch(Exception ex) {
			System.out.println(ex.getClass().getName()  + " hendled");
		}
	}

}
