package Type1;

interface Outer {

	public void m1();

	interface Inner {
		public void m2();
	}
}

public class Test implements Outer.Inner {

	@Override
	public void m2() {
		System.out.println("m2 called");

	}
	
	public static void main(String[] args) {
		new Test().m2();
	}

}
