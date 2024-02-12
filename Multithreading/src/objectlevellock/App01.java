package objectlevellock;



class MyClass implements Runnable{
	@Override
	public void run() {
		lockingNonStaticMethod();
	}
	
	public void lockingNonStaticMethod() {
		System.out.println(Thread.currentThread().getName()+" got the lock");
		
		// this is used to refer current object
		synchronized (this) {
			System.out.println("Synchronized code executed by "+Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+" Released the lock");
			
			System.out.println("------");
		}
	}
	
}
 
public class App01 {
	public static void main(String[] args) {
	 
		MyClass myClass1 = new MyClass();
		
		
		Thread thread1 = new Thread(myClass1);
		Thread thread2 = new Thread(myClass1);
		
		thread1.setName("Thread - 1");
		thread2.setName("Thread - 2");
		
		
		thread1.start();
		thread2.start();
		
	}
}
