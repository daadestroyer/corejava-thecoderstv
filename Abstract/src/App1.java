
abstract class GrandFather {

	// incomplete dream
	abstract void TwelthBoardExam();
}

abstract class Father extends GrandFather {

	// incomplete dream
	abstract void TwelthBoardExam();

}

class Child extends Father {

	void TwelthBoardExam() {
		System.out.println("dream completed...");
	}
}

public class App1 {
	public static void main(String[] args) {

	}
}
