class President extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("President Thread");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name of Thread = " + Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		}
	}
}

class PrimeMinister extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setPriority(7);
		Thread.currentThread().setName("PrimeMinister Thread");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name of Thread = " + Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		}
	}
}

class ChiefMinister extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setPriority(5);
		Thread.currentThread().setName("ChiefMinister Thread");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name of Thread = " + Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		}
	}
}

class DM extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setPriority(1);
		Thread.currentThread().setName("DM Thread");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name of Thread = " + Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		}
	}
}

public class App08 {
	public static void main(String[] args) {
		President president = new President();
		PrimeMinister primeMinister = new PrimeMinister();
		ChiefMinister chiefMinister = new ChiefMinister();
		DM dm = new DM();
		
		
		president.start();
		primeMinister.start();
		chiefMinister.start();
		dm.start();
	}
}
