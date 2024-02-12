package Type1;

class OuterVechileType {

	interface Vechile {
		public int getNoWheels();
	}

	class InnerBusClass implements Vechile {

		@Override
		public int getNoWheels() {
			// TODO Auto-generated method stub
			return 8;
		}

	}

	static class InnerCarClass implements Vechile {

		@Override
		public int getNoWheels() {
			// TODO Auto-generated method stub
			return 4;
		}

	}
}

public class Test8 {
	public static void main(String[] args) {
		System.out.println(new OuterVechileType().new InnerBusClass().getNoWheels());
		
		System.out.println(new OuterVechileType.InnerCarClass().getNoWheels());
	}
}
