class MyApp extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println("MyApp Thread");
		}
	}
	// just like a normal method
	public void run(int a) {
		System.out.println("Integer run method = "+a);
	}
}
public class App02 {
	public static void main(String[] args) {
		MyApp app = new MyApp();
		app.start();
		app.run(10);
		// no output
	}
}
