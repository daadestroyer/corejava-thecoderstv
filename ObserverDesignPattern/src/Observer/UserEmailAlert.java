package Observer;

import Observable.ProductObservable;

public class UserEmailAlert implements UserObserver {

	String emailId;
	ProductObservable productObservable;

	public UserEmailAlert(String emailId, ProductObservable productObservable) {
		super();
		this.emailId = emailId;
		this.productObservable = productObservable;
	}

	@Override
	public void update() {
		sendEmail(emailId, "product is on stock hurry up");
	}

	private void sendEmail(String emailId, String msg) {
		System.out.println("mail send to : " + emailId);
	}

}
