package interthreadcommunication;

class User {
	public User() throws InterruptedException {
		Hotstar hotstar = new Hotstar();
		hotstar.start();
		synchronized (hotstar) {
			System.out.println("Users are waiting for a Match to Begin ...");
			hotstar.wait();
			System.out.println("Got a notification from Hotstar");
		}
	}
}

class Hotstar extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Match Begins in "+i+" Seconds...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Match is LIVE NOW . . .");
			this.notify();
		}
	}
}

public class App {
	public static void main(String[] args) throws InterruptedException {
		User user = new User();
	}
}