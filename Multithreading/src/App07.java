
class ChildThread extends Thread {
	@Override
	public void run() {
		//Thread.currentThread().setPriority(1);
		Thread.currentThread().setName("ChildThread");
		System.out.println("Name of ChildThread class = " + Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		for (int i = 1; i <= 5; i++) {
			System.out.println("ChildThread = " + i);
		}
	}
}

public class App07 {
	public static void main(String[] args) {
		// instantiating object for child thread
		ChildThread ch = new ChildThread();
		ch.start(); // starting child thread

		// main thread
		//Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("MainThread");
		System.out.println("Name of MainThread class = "+Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		for (int i = 1; i <= 5; i++) {
			System.out.println("MainThread = " + i);
		}

	}
}
