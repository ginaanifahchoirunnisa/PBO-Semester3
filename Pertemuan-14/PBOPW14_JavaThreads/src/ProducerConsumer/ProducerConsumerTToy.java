package ProducerConsumer;

public class ProducerConsumerTToy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q Objek = new Q();
		new Producer(Objek);
		new Consumer(Objek);
		
		System.out.println("Tekan Ctrl-C untuk stop");
	}

}

class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted.");
			}
		}
		System.out.println("Got : "+n);
		valueSet = false;
		notify();
		return n;
	}
	
	
	synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted.");
			}
		}
		
		this.n = n;
		valueSet = true;
		System.out.println("Put :"+n);
	}
	
}


class Producer implements Runnable{
	Q Objek;
	
	Producer (Q q){
		this.Objek = q;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		int i =0;
		
		while(true) {
			Objek.put(i++);
		}
	}
}


class Consumer implements Runnable{
	Q Objek;
	
	Consumer(Q q){
		this.Objek = q;
		new Thread(this , "Consumen").start();
	}
	
	public void run() {
		while(true) {
			Objek.get();
		}
	}
}

