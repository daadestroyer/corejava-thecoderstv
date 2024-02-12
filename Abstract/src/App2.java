
abstract class CarFactory {
	// necessary property
	void tyre() {
		System.out.println("4 Tyre");
	}

	// necessary property
	void enginee() {
		System.out.println("1 Enginee");
	}

	// we don't about implementation
	abstract void airbags();
}

class WagonrCar extends CarFactory {
	// tyre
	// enginee
	// airbag
	@Override
	void airbags() {
		System.out.println("No airbag");

	}
}

class AltoCar extends CarFactory {
	// tyre
	// enginee
	// airbag
	@Override
	void airbags() {
		System.out.println("No airbag");

	}
}

class AudiCar extends CarFactory {
	// tyre
	// enginee
	// airbag
	@Override
	void airbags() {
		System.out.println("4 airbag");

	}
}

class BMWCar extends CarFactory {
	// tyre
	// enginee
	// airbag
	@Override
	void airbags() {
		System.out.println("6 airbag");

	}
}

class RollsRoyceCar extends CarFactory {
	// tyre
	// enginee
	// airbag
	@Override
	void airbags() {
		System.out.println("8 airbag");

	}
}

public class App2 {
	public static void main(String[] args) {
		WagonrCar w = new WagonrCar();
		w.tyre();
		w.enginee();
		w.airbags();

		System.out.println();

		AltoCar a = new AltoCar();
		a.tyre();
		a.enginee();
		a.airbags();

		System.out.println();

		AudiCar ad = new AudiCar();
		ad.tyre();
		ad.enginee();
		ad.airbags();

		System.out.println();

		BMWCar b = new BMWCar();
		b.tyre();
		b.enginee();
		b.airbags();

		System.out.println();

		RollsRoyceCar r = new RollsRoyceCar();
		r.tyre();
		r.enginee();
		r.airbags();
	}
}
