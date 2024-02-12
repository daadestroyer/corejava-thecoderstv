
class ChildClass extends Thread{
	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Child Thread Invoked = "+i);
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println();
				System.out.println("Exception: Someone Interupted me ...");
				System.out.println();
			}
		}
	}
}
public class App13 {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.start();
		
		childClass.interrupt();
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Parent Thread Invoked = "+i);
		}
	}
}
