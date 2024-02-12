
public class Test {

	public static void m1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("code running fine");
	}

	public static void m2() {
		m1();
	}

	public static void m3() {
		m2();
	}

	public static void main(String args[]) {
		m3();
	}
}
