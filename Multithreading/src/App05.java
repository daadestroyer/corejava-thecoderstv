// creating thread by extending thread class

class LoginInfo{
	private int userId;
	private String userName;
	private String userPassword;
}
class MyThreadd extends Thread{
		@Override
		public void run() {
			for(int i=0 ; i<5 ; i++) {
				System.out.println("MyThreadd = "+i);
			}
		}
}
public class App05 {
	public static void main(String[] args) {
		MyThreadd mt = new MyThreadd();
		mt.start();
	}
}
