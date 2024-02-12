
interface ATM {
	// interface contains only abstract method

	int amount = 10000; // by default this variable is public static and final

	public static final String bankName = "city bank";

	String withDraw();// by default this method is abstract and public also

	public abstract String checkBal();

}

class User1 implements ATM {

	// amount , bankName

	@Override
	public String withDraw() {
		return "user want to withdraw 1000Rs";
	}

	@Override
	public String checkBal() {
		return "user bal = 40000Rs";
	}

}

class User2 implements ATM {

	@Override
	public String withDraw() {
		return "user want to withdraw 500Rs";
	}

	@Override
	public String checkBal() {
		return "user bal = 4000Rs";
	}

}

public class App1 {
	public static void main(String[] args) {
		User1 user1 = new User1();

		System.out.println(user1.amount + ":" + user1.bankName);
		System.out.println(user1.withDraw() + ":" + user1.checkBal());
		
		System.out.println();
		
		User2 user2 = new User2();

		System.out.println(user2.amount + ":" + user2.bankName);
		System.out.println(user2.withDraw() + ":" + user2.checkBal());
	}
}
