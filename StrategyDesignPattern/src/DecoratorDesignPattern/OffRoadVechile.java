package DecoratorDesignPattern;

public class OffRoadVechile extends Vechile {
	public OffRoadVechile() {
		super(new SportDriveStrategy());
	}
}
