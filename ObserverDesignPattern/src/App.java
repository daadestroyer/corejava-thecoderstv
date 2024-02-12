import java.time.LocalTime;
import java.util.Date;

import Observable.IphoneObservableImpl;
import Observer.UserEmailAlert;

public class App {
	public static void main(String[] args) {
		IphoneObservableImpl iphoneObservableImpl = new IphoneObservableImpl();
		
		UserEmailAlert userEmailAlert1 = new UserEmailAlert("shubham@gmail.com", iphoneObservableImpl);
		UserEmailAlert userEmailAlert2 = new UserEmailAlert("ansh@gmail.com", iphoneObservableImpl);
		
		iphoneObservableImpl.subscribe(userEmailAlert1);
		iphoneObservableImpl.subscribe(userEmailAlert2);
		
		iphoneObservableImpl.setStockCount(10);
		
	}
}
