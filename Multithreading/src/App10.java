

class MyThrd extends Thread{
	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Child Thread = "+i);
		}
	}
}
public class App10 {
	public static void main(String[] args) throws InterruptedException {
		MyThrd t = new MyThrd();
		t.start();
		
		t.join();
		
		// parent thread
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Parent Thread = "+i);
		}
		
	}
}
