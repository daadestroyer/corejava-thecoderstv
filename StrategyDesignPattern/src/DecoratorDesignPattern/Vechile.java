package DecoratorDesignPattern;

public class Vechile {
	private DriveStrategy driveStrategy;
	
	public Vechile(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public void drive() {
		this.driveStrategy.drive();
	}
}
