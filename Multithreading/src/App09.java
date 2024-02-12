class MyThreaddd extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("MyThreaddd");
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		Thread.yield(); // trying to pause it self again and again
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread Executed = " + i);
		}
	}
}

public class App09 {
	public static void main(String[] args) {
		
		// instantiating MyThreaddd 
		MyThreaddd mt1 = new MyThreaddd();
		mt1.start();
		
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		for(int i=1 ; i <= 5 ; i++) {
			System.out.println("Main Thread = "+i);
		}
	}
}
