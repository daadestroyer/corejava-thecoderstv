
class Demo extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<3 ; i++) {
			System.out.println("Demo Class Thread = "+i);
		}
	}
	public void start() {
		this.run();
		System.out.println("Demo class start method");
		
	}
	
}
public class App03 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
	}
}
