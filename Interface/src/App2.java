
interface Left {
	int x = 100; // public static final

	void m1(); // public abstract
}

interface Right {
	int x = 200;

	int m1(int a);
}

class Test implements Left, Right {
	
	static int x = 300;
	public int m1(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}

public class App2 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(Left.x);
		System.out.println(Test.x);
		System.out.println(Right.x);
	}
}
