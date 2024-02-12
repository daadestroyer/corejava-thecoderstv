package classlevelock;



class MyClass implements Runnable {
	@Override
	public void run() {
		lockingStaticMethod();
	}

	public static synchronized void lockingStaticMethod() {
		System.out.println(Thread.currentThread().getName()+" got the lock");
		
		synchronized (MyClass.class) {
			System.out.println("Synchronized code executed by " + Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + " Released the lock");

			System.out.println("------");
		}
	}
}

public class App01 {
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		Thread thread1 = new Thread(myClass1);
		
		MyClass myClass2 = new MyClass();
		Thread thread2 = new Thread(myClass2);

		MyClass myClass3 = new MyClass();
		Thread thread3 = new Thread(myClass3);

		thread1.setName("Thread - 1");
		thread2.setName("Thread - 2");
		thread3.setName("Thread - 3");

		thread3.start();
		thread1.start();
		thread2.start();
		

	}

}
