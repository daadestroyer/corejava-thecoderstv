

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyAppp Thread = " + i);
		}
	}
}

public class App04 {
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread t = new Thread(runnable);
		t.start();
	}
}
