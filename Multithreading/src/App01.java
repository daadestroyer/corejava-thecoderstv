
class MyThread extends Thread {
	
	
	@Override
	public void run() {
		Thread.currentThread().setName("My Thread");
		System.out.println("--"+Thread.currentThread().getName()+"--");
		
		synchronized (MyThread.class) {
			
		}
		
		// whatever work we want we can write here to perform using thread
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread running " + i);
		}
	}
}

public class App01 {
	public static void main(String[] args) {
		// to create to our own thread below are the rules
		// 1. create our own class
		// 2. extend the Thread class
		// 3. override the run method
		// 4. instansiate our own thread class
		
		Thread.currentThread().setName("--Main Thread--");
		System.out.println(Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		 
		t1.start(); // 1. create new thread in memory or registering it
					// 2. execute the overrided run method
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Main Thread "+i);
		}

	}
}
