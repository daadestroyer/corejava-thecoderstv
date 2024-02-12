// creating thread by implementing runnable interface

class UserLoginInfo{
	private int userId;
	private String userName;
	private String userPassword;
}

class MyRunnablee extends UserLoginInfo implements Runnable {
	@Override 
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println("MyRunnablee = "+i);
		}
	}
}
public class App06 {
	public static void main(String[] args) {
		Runnable runnable = new MyRunnablee();
		Thread t = new Thread(runnable);
		t.start();
 	}
}
