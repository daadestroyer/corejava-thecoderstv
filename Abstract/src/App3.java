
abstract class Parent {
	void gold() {
		System.out.println("1kg gold");
	}

	abstract void land();

}

class Child1 extends Parent {

	// gold
	// land
	void land() {
		System.out.println("opened restraunt");
	}

}

class Child2 extends Parent {
	// gold
	// land
	void land() {
		System.out.println("gym restraunt");
	}
}

class Child3 extends Parent {
	// gold
	// land
	void land() {
		System.out.println("hostel restraunt");
	}
}

public class App3 {
	public static void main(String[] args) {
		Child1 cc1 = new Child1();
		cc1.gold();
		cc1.land();

		System.out.println();

		Child2 cc2 = new Child2();
		cc2.gold();
		cc2.land();

		System.out.println();

		Child3 cc3 = new Child3();
		cc3.gold();
		cc3.land();

		System.out.println();
	}
}
