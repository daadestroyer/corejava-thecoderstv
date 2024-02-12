class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("good morning: " + name);
			System.out.println("");
		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(name);
//		}
	}
}

class OurThread extends Thread {
	Display display;
	String name;

	public OurThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}

public class App14 {
	public static void main(String[] args) {
		Display d1 = new Display();
		OurThread ourThread1 = new OurThread(d1, "Dhoni");
		OurThread ourThread2 = new OurThread(d1, "Kohli");

		ourThread1.start();
		System.out.println();
		ourThread2.start();
	}
}
